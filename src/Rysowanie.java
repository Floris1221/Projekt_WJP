import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rysowanie {
Graphics g;

    Rysowanie(Graphics g){
    this.g=g;

    }


    Graphics rysowanie1(){
        g.fillRect(100,100,400,400);

        return g;
    }

}
