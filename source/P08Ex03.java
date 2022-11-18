import tg.*;

public class P08Ex03 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();

        Stepper m1 = new Stepper();
        f.add(m1);

        Stepper m2 = new Stepper();
        f.add(m2);

        Stepper m3 = new Stepper();
        f.add(m3);

        Stepper m4 = new Stepper();
        f.add(m4);

        m1.n = 3;
        m1.size = 100;

        m2.n = 4;
        m2.size = 100;

        m3.n = 5;
        m3.size = 100;

        m4.n = 6;
        m4.size = 100;

        // set start position
        m1.up();
        m1.moveTo(100, 200, 0);
        m1.down();
        // m2 locate default position (200,200)

        m3.up();
        m3.moveTo(100, 350, 0);
        m3.down();

        m4.up();
        m4.moveTo(200, 350, 0);
        m4.down();

        for (int i = 0; i < 6; i++) {
            m1.step();
            m2.step();
            m3.step();
            m4.step();
        }
    }
}
