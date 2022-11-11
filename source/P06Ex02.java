import tg.*;

public class P06Ex02 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();
        // length of star
        double s = 50;

        f.add(m);
        m.speed(2);

        m.star(s);

    }
}
