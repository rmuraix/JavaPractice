import tg.*;

public class P521 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();
        f.add(m);
        // Executing "public void house(double s)" in HTurtle because it has one argument.
        m.house(60);
        // Executing "public void house(double s, double x, double y)" in MyTurtle because it has
        // three argument.
        m.house(50, 50, 150);
        m.house(40, 50, 350);
    }
}