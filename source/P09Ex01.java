import tg.*;

public class P09Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();

        CStepper m1 = new CStepper(3, 100, 100, 200, 0);
        f.add(m1);

        CStepper m2 = new CStepper(4, 100);
        f.add(m2);

        CStepper m3 = new CStepper(5, 100, 100, 350, 0);
        f.add(m3);

        CStepper m4 = new CStepper(6, 100, 200, 350, 0);
        f.add(m4);
        
        // n,sizeはプライベートであるから外部から利用できない

        for (int i = 0; i < 6; i++) {
            m1.step();
            m2.step();
            m3.step();
            m4.step();
        }
    }
}
