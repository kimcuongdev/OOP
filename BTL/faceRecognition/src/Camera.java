import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

public class Camera {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        // Load the cascade classifier for face detection
        CascadeClassifier faceCascade = new CascadeClassifier();
        faceCascade.load("C:\\OpenCV\\opencv\\build\\etc\\lbpcascades\\lbpcascade_frontalface_improved.xml"); // Path to your cascade classifier XML file
        
        // Open the default camera (usually 0)
        VideoCapture videoCapture = new VideoCapture(0);
        
        // Check if camera is opened
        if (!videoCapture.isOpened()) {
            System.out.println("Error: Camera not opened!");
            return;
        }
        
        // Create a window to display the camera feed
        HighGui.namedWindow("Camera", HighGui.WINDOW_AUTOSIZE);
        
        // Matrices to store frames from camera and detected faces
        Mat frame = new Mat();
        Mat grayFrame = new Mat();
        
        // Main loop to capture frames and perform face detection
        while (true) {
            // Capture frame from camera
            videoCapture.read(frame);
            
            // Flip the frame horizontally
            Core.flip(frame, frame, 1); // 1 for horizontal flip
            
            // Convert frame to grayscale for face detection
            Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);
            Imgproc.equalizeHist(grayFrame, grayFrame);
            
            // Detect faces in the frame
            MatOfRect faces = new MatOfRect();
            faceCascade.detectMultiScale(grayFrame, faces);
            
            // Draw rectangles around detected faces
            for (Rect rect : faces.toArray()) {
                Imgproc.rectangle(frame, new org.opencv.core.Point(rect.x, rect.y), 
                                   new org.opencv.core.Point(rect.x + rect.width, rect.y + rect.height), 
                                   new Scalar(0, 255 ,255 ), 5);
            }
            
            // Display the frame with detected faces
            HighGui.imshow("Camera", frame);
            // Check for key press every 30ms
            if (HighGui.waitKey(30) >= 0) {
                break;
            }
        }
        
        // Release the camera and close all windows
        videoCapture.release();
        HighGui.destroyAllWindows();
    }
}
