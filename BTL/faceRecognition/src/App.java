import org.opencv.core.Point;

import java.util.Scanner;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;
import org.opencv.highgui.HighGui;
import org.opencv.objdetect.CascadeClassifier;

public class  App {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Scanner sc = new Scanner(System.in);
        VideoCapture camera = new VideoCapture(0);
        //Mat img = Imgcodecs.imread("D:/Downloads/obama.jpg");
        CascadeClassifier faceDetect = new CascadeClassifier("D:/path/haarcascade_frontalface_default.xml");
        MatOfRect faceRectt = new MatOfRect();
        
        //HighGui.imshow("ST M-TP", img); HighGui.waitKey(0);
        //Imgcodecs.imwrite("D:/Picture/face1.png", img);
        //System.out.println("hello");
        camera.set(Videoio.CAP_PROP_FRAME_WIDTH, 600);
        camera.set(Videoio.CAP_PROP_FRAME_HEIGHT, 400);

        Mat img = new Mat();
        int count=1;
        while (true) {
            if (!camera.read(img)) {
                System.out.println("Không thể nhận được khung hình");
                break;
            }
            Mat gray = new Mat();
            Imgproc.cvtColor(img, gray, Imgproc.COLOR_BGR2GRAY);
            faceDetect.detectMultiScale(gray, faceRectt);
        for (Rect rect : faceRectt.toArray())
            {
                Imgproc.rectangle(img, new Point(rect.x, rect.y) , new Point(rect.x + rect.width, rect.y + rect.height) , new Scalar(0, 0, 255));
                Mat faceImage = new Mat(img, rect);
                Imgcodecs.imwrite("D:/dataSet/" + count + ".jpg", faceImage);
            }
            
            if(count == 90) break;
            count++;
            HighGui.imshow("Camera", img);
            if (HighGui.waitKey(500) == 'q') {
                break;
            }
        }

        // // Giải phóng tài nguyên
        camera.release();
        HighGui.destroyAllWindows();
        sc.close();
        //Imgcodecs.imwrite("D:/Downloads/2.png", img);
    }
}
