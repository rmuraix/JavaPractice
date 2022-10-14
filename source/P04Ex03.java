import tg.*;

public class P04Ex03 {
    public static void main(String[] args){
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle(0, 400,0);// Place in the lower left corner of the window
        f.add(m);
        for (int i = 2; i < 360; i += 2){
            m.fd(50);
            m.rt(i);
        }
    }
}
