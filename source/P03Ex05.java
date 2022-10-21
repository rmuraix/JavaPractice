import tg.*;

public class P03Ex05 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        m.up();
        Point p = f.getMousePosition();
        m.moveTo(p.x, p.y, 0);
        m.down();

        for (int i = 0; i < 5; i++) { // star
            m.rt(144);
            m.fd(100);
        }
    }
}
