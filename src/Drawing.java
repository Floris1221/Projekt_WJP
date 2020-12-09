import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.text.AttributedCharacterIterator;

public class Drawing {
    URL url = getClass().getResource("/grass.jpg");
    BufferedImage img;
    public Graphics Draw(Graphics g,StartGUI f){



        {
            try {
                img = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Błąd");
            }
        }

        g.drawImage(img,0,0,null);
        //g.drawLine(10,10,50,60);
        return g;
    }
}
