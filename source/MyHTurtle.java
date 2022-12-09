import tg.*;

public class MyHTurtle extends HTurtle {
    public void house(double s) {
        super.house(s);
        up();
        rt(90);
        fd(s / 4);
        lt(90);
        fd(s / 4);
        down();
        this.polygon(4, s / 2);
    }

    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyHTurtle m = new MyHTurtle();
        f.add(m);
        m.house(50);
    }
}
