import tg.*;
import javafx.scene.paint.Color;

public class P10Ex02 {
    public static void main(String[] args) {
        double[] size = { 20, 40, 20, 60, 10, 30 };
        int[] n = { 7, 5, 4, 3, 6, 12 };
        Color[] c = { Color.ORANGE, Color.RED, Color.BLUE, Color.DARKVIOLET, Color.CHOCOLATE };

        TurtleFrame f = new TurtleFrame(600, 300);
        HTurtle[] hm = new HTurtle[10];
        
        for (int i = 0; i < hm.length; i++) {
            hm[i] = new HTurtle(i * 50 + 25, 150, 0);
            hm[i].setColor(c[i % c.length]);
            f.add(hm[i]);
        }
        for (int i = 0; i < hm.length; i++) {
            int nn = n[i % n.length];
            hm[i].polygon(nn, size[i % size.length]);
        }
    }
}
