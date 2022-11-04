import tg.*;
import javafx.scene.paint.Color;

public class P05Ex09 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        Turtle.speedAll(1);
        Turtle.withTurtleAll = false;
        f.add(m);

        int i = 0;

        for (;;) {
            m.up();

            Point p = f.getMousePosition();
            m.moveTo(p.x, p.y, 0);

            i++;

            if (i % 3 == 0) {
                m.setColor(Color.RED);
            } else if (i % 3 == 1) {
                m.setColor(Color.GREEN);
            } else {
                m.setColor(Color.YELLOW);
            }

            m.down();

            Long n = Math.round((Math.random() + 1) * 3);
            Long fd_lengs = Math.round((Math.random() + 1) * 10);

            System.out.println(n + "äpå`" + "(" + Math.round(p.x) + "," + Math.round(p.y) + ")");

            for (int k = 0; k < n; k++) {
                m.lt(360 / n);
                m.fd(fd_lengs);
            }
        }
    }
}
