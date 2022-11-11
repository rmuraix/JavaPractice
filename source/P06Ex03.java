import tg.*;

public class P06Ex03 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        // Number of angles, Number of shape, Length, Space bitween shapes
        m.polygons(3, 5, 10, 10);
    }
}
