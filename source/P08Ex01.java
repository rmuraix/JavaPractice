import tg.*;

public class P08Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        m.pPolygon(10, 3, 15);

        m.up();
        m.moveTo(100, 100);
        m.down();

        // drow another shape
        m.pPolygon(12, 4, 10);

    }
}
