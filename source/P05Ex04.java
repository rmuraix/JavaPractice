import tg.*;

public class P05Ex04 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        Turtle.speedAll(1);

        for (int i = 0; i < 1000; i++) {
            m.fd(10);
            double rand = Math.random() * 360;
            m.rt(rand);
        }
    }
}
