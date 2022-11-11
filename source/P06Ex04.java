import tg.*;

public class P06Ex04 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        m.speed(2);

        m.houses(20, 5, 10);

    }
}
