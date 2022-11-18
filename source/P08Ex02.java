import tg.*;
public class P08Ex02 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        m.houses(30, 100, 100, 4, 10);
        m.houses(40, 200, 200, 4, 20);
        m.houses(10, 100, 300, 5, 30);

    }
}
