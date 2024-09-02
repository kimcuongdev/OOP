import javax.swing.JFrame;
public class myWindow extends JFrame {
    public myWindow()
    {
        this.setDefaultCloseOperation(myWindow.EXIT_ON_CLOSE);
    }
    public void showscr()
    {
        this.setVisible(true);
    }
    public void showscr(String title)
    {
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showscr(String title, int width, int height)
    {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        myWindow m = new myWindow();
        m.showscr();

        myWindow m2 = new myWindow();
        m2.showscr("window 2");

        myWindow m3 = new myWindow();
        m3.showscr("Window 3", 600, 600);
    }
}
