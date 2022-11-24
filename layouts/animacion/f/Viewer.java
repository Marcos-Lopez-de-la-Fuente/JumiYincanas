import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Viewer extends Canvas implements Runnable {
    // Atribut
    private BufferedImage imagen;
    private int cordenadaX = 0;
    private int cordenadaY = 0;

    private int dirX = 1;
    private int dirY = 1;

    // En el constructor cargaremos una imagen del disco
    public Viewer() {

        try {
            this.imagen = ImageIO.read((new File("./layouts/animacion/fondo.jpg")));
        } catch (IOException e) {
            System.out.println("IMG ERROR");
        }
    }

    public void paintBackground() {
        Graphics g = this.getGraphics();
        if (g == null) {
            System.out.println("La G es nula");
            return;
        }
        g.drawImage(this.imagen, 0, 0, null);
    }

    public void paintRectangle() {
        Graphics g = this.getGraphics();
        g.drawRect(cordenadaX, cordenadaY, 10, 10);
    }

    @Override
    public void paint(Graphics g) {
    }

    @Override
    public void run() {
        while (true) {
            if (dirX == 1) {
                cordenadaX = cordenadaX + 1;
                if (cordenadaX == this.getWidth()) {
                    dirX = 0;
                }
            }
            if (dirY == 1) {
                cordenadaY = cordenadaY + 1;
                if (cordenadaY == this.getHeight()) {
                    dirY = 0;
                }
            }
            if (dirX == 0) {
                cordenadaX = cordenadaX - 1;
                if (cordenadaX == 0) {
                    dirX = 1;
                }
            }
            if (dirY == 0) {
                cordenadaY = cordenadaY - 1;
                if (cordenadaY == 0) {
                    dirY = 1;
                }
            }
            this.paintBackground();
            this.paintRectangle();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
