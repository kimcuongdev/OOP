import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class choosePhoto {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {
        // Mở cửa sổ chọn file 
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileChooser.setDialogTitle("Chọn ảnh để phát hiện khuôn mặt");
        fileChooser.setFileFilter(filter);
        
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();
            String imagePath = fileToOpen.getAbsolutePath();
            String selectedFolderPath = "selected";
            String outputImagePath = selectedFolderPath + "/output.jpg";  // Đường dẫn tới ảnh kết quả

            // Tạo thư mục selected nếu chưa tồn tại
            File selectedFolder = new File(selectedFolderPath);
            if (!selectedFolder.exists()) {
                selectedFolder.mkdir();
            }
            
            // Sao chép ảnh vào thư mục selected
            File copiedFile = new File(selectedFolderPath, "selected_image.jpg");
            try {
                Files.copy(Paths.get(imagePath), copiedFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            // Đọc ảnh từ thư mục selected
            Mat src = Imgcodecs.imread(copiedFile.getAbsolutePath());

            if (src.empty()) {
                System.out.println("Không thể mở ảnh: " + copiedFile.getAbsolutePath());
                return;
            }

            // Tải bộ phân loại Haar Cascade cho phát hiện khuôn mặt
            CascadeClassifier faceDetector = new CascadeClassifier("C:\\OpenCV\\opencv\\build\\etc\\lbpcascades\\lbpcascade_frontalface_improved.xml");

            if (faceDetector.empty()) {
                System.out.println("Không thể tải bộ phân loại");
                return;
            }

            // Phát hiện khuôn mặt
            MatOfRect faceDetections = new MatOfRect();
            faceDetector.detectMultiScale(src, faceDetections);

            // Vẽ hình chữ nhật xung quanh khuôn mặt được phát hiện
            for (Rect rect : faceDetections.toArray()) {
                Imgproc.rectangle(src, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                        new Scalar(0, 255, 0), 3);
            }

            // Lưu ảnh kết quả
            Imgcodecs.imwrite(outputImagePath, src);

            // Hiển thị ảnh kết quả
            displayImage(matToBufferedImage(src), "Kết quả phát hiện khuôn mặt");
        }
    }
    private static BufferedImage matToBufferedImage(Mat mat) {
        int type = (mat.channels() == 1) ? BufferedImage.TYPE_BYTE_GRAY : BufferedImage.TYPE_3BYTE_BGR;
        BufferedImage image = new BufferedImage(mat.width(), mat.height(), type);
        mat.get(0, 0, ((DataBufferByte) image.getRaster().getDataBuffer()).getData());
        return image;
    }

    private static void displayImage(BufferedImage img, String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImagePanel imagePanel = new ImagePanel(img);
        JScrollPane scrollPane = new JScrollPane(imagePanel);
        
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        //imagePanel.zoomToFit();
    }
}

