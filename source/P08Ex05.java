import tg.*;

public class P08Ex05 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        m.polygons(5, 4, 30, 10, 50, 50);
        m.polygons(8, 5, 40, 20, 250, 250);
        m.polygons(3, 2, 20, 10, 200, 200);
    }
}
