import tg.*;

public class P04Ex05 {
    public static void main(String[] args){
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        m.rt(45);
        for (int i = 2; i < 10; i++){
            m.fd(50);
            draw(i + 1, m);
            m.rt(45);
        }
    }
    // Drawing outside shapes
    public static void draw(int n, Turtle m){
        for (int i = 0; i < n; i++){
            m.lt(360/n);
            m.fd(50);
        }
    }
}
