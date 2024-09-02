import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import java.awt.image.BufferedImage;

class ImagePanel extends JPanel {
    private BufferedImage image;
    private double scale = 1.0;
    private int offsetX = 0;
    private int offsetY = 0;
    private int initialX = 0;
    private int initialY = 0;

    public ImagePanel(BufferedImage image) {
        this.image = image;
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                double oldScale = scale;
                if (e.getPreciseWheelRotation() < 0) {
                    scale *= 1.1;
                } else {
                    scale /= 1.1;
                }

                double scaleChange = scale / oldScale;

                offsetX = (int) ((offsetX - mouseX) * scaleChange + mouseX);
                offsetY = (int) ((offsetY - mouseY) * scaleChange + mouseY);

                revalidate();
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                initialX = e.getX() - offsetX;
                initialY = e.getY() - offsetY;
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                offsetX = e.getX() - initialX;
                offsetY = e.getY() - initialY;
                revalidate();
                repaint();
            }
        };
        this.addMouseWheelListener(mouseAdapter);
        this.addMouseMotionListener(mouseAdapter);
        this.addMouseListener(mouseAdapter);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int imgWidth = (int) (image.getWidth() * scale);
        int imgHeight = (int) (image.getHeight() * scale);
        int x = (getWidth() - imgWidth) / 2 + offsetX;
        int y = (getHeight() - imgHeight) / 2 + offsetY;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(image, x, y, imgWidth, imgHeight, this);
    }

    @Override
    public Dimension getPreferredSize() {
        int width = (int) (image.getWidth() * scale);
        int height = (int) (image.getHeight() * scale);
        return new Dimension(width, height);
    }

    public void zoomToFit() {
        double panelWidth = getWidth();
        double panelHeight = getHeight();
        double imgWidth = image.getWidth();
        double imgHeight = image.getHeight();

        double scaleX = panelWidth / imgWidth;
        double scaleY = panelHeight / imgHeight;

        scale = Math.min(scaleX, scaleY);

        offsetX = 0;
        offsetY = 0;

        revalidate();
        repaint();
    }
}