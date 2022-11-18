import tg.*;

public class P08Ex07 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        m.up();
        m.moveTo(50, 50, 0);
        m.down();

        m.stars(10, 10, 30);

        m.up();
        m.moveTo(50, 100, 0);
        m.down();

        m.flower(6, 10, 10);
        // draw stem
        m.rt(180);
        m.fd(50);
        m.rt(180);

        double baseX = m.getX();
        double baseY = m.getY();

        //draw leaf
        m.lt(30);
        m.fd(20);
        m.up();
        m.moveTo(baseX, baseY, 0);
        m.down();
        m.rt(30);
        m.fd(20);

        m.up();
        m.moveTo(100, baseY, 0);
        m.down();
        // draw house
        m.house(20);
    }
}
