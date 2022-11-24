import tg.*;
import javafx.scene.paint.Color;

public class P08Ex08 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(720, 540);
        MyTurtle m = new MyTurtle();
        f.add(m);
        m.speed(1);
        // draw circle
        m.polygon(360, 1, 20, 60);
        // draw stars
        m.up();
        m.moveTo(150, 60, 0);
        m.down();
        m.stars(20, 5, 30);
        m.up();
        m.moveTo(150, 100, 0);
        m.down();
        m.setColor(Color.RED);
        m.stars(20, 10, 30);

        // draw houses
        m.setColor(Color.GREEN);
        m.houses(40, 20, 200, 5, 30);

        // draw flowers
        m.up();
        m.moveTo(30, 300, 0);
        m.down();
        m.flower(10, 5, 5);

        m.up();
        m.moveTo(150, 300, 0);
        m.down();
        m.setColor(Color.YELLOW);
        m.flower(5, 50, 5);

    }
}
