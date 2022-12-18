import tg.*;

public class P12Ex02 {
    public static void main(String args[]) {
        TurtleFrame f = new TurtleFrame();
        Drawable[] hm = new Drawable[4];
        hm[0] = new DrawHouse();
        f.add((Turtle) hm[0]);
        hm[1] = new DrawStar();
        f.add((Turtle) hm[1]);
        hm[2] = new DrawText();
        hm[3] = new PTurtle();
        f.add((Turtle) hm[3]);

        while (true) {
            int n = (int) (Math.random() * hm.length);
            double x = Math.random() * 400;
            double y = Math.random() * 400;
            hm[n].draw(x, y);
        }
    }
}
