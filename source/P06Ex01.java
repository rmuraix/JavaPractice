import tg.*;

public class P06Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();
        double size = 50;

        f.add(m);
        m.speed(2);

        m.house(size);

        m.up();
        m.lt(90);
        m.fd(50);
        m.rt(72);
        m.down();

        m.polygon(5, size / 2);

        m.up();
        m.moveTo(100, 100, 0);
        m.down();

        m.polygon(10, size / 5);
    }
}
