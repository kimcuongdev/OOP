
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;


public class Test {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        VideoCapture camera = new VideoCapture(0); // Mở webcam
        if (!camera.isOpened()) {
            System.out.println("Error: Unable to open camera!");
            return;
        }
        Mat frame = new Mat();
        camera.read(frame); // Đọc frame từ webcam

        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".jpg", frame, matOfByte); // chuyen frame ve dang anh

        byte[] byteArray = matOfByte.toArray();

        try
        {
            InputStream in = new ByteArrayInputStream(byteArray);
            BufferedImage bufferedImage = ImageIO.read(in); //tao anh tu du lieu byte

            //hien thi anh trong cua so moi
            JFrame window = new JFrame("Webcam");
            window.setSize(640,480);
            JLabel label = new JLabel(new ImageIcon(bufferedImage));
            window.setContentPane(label);
            window.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        camera.release();
}
}
