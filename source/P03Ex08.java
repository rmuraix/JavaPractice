import tg.*;
import javafx.scene.paint.*;

public class P03Ex08 {
    public static void main(String[] args){
        TurtleFrame f = new TurtleFrame();
        // blue turtle
        Turtle m = new Turtle();
        f.add(m);
        Color blue = new Color(0, 0, 1, 1);
        m.tColor = blue;
        m.setColor(blue);

        m.up();

        Point start_p = f.getMousePosition();
        m.moveTo(start_p.x, start_p.y, 0);

        m.down();

        for (int i = 0; i < 2; i++){
            Point p = f.getMousePosition();
            m.moveTo(p.x, p.y, 0);
        }

        m.moveTo(start_p.x, start_p.y, 0); // move to start position

        // green turtle
        Turtle m1 = new Turtle();
        f.add(m1);
        Color green = new Color(0, 1, 0, 1);
        m1.tColor = green;
        m1.setColor(green);
        
        m1.tScale *= 1.2;

        m1.up();

        start_p = f.getMousePosition();
        m1.moveTo(start_p.x, start_p.y, 0);

        m1.down();

        for (int i = 0; i < 2; i++){
            Point p = f.getMousePosition();
            m1.moveTo(p.x, p.y, 0);
        }

        m1.moveTo(start_p.x, start_p.y, 0); // move to start position
    }
}
