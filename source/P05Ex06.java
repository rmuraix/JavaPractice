import tg.*;

public class P05Ex06 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        Turtle.speedAll(1);

        for (int i = 0; i < 1000; i++) {

            m.fd(Math.random() * 10);
            m.rt(Math.random() * 360);
        }
    }
}
