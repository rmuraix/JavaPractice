import tg.*;

public class P08Ex06 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);
        Turtle.withTurtleAll = false;
        //  number of corners, length, turn
        m.flower(6, 10, 10);

        m.up();
        m.moveTo(100, 100);
        m.down();
        // another flower
        m.flower(8, 20, 12);

    }
}
