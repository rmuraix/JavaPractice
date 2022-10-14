import tg.*;
public class P04Ex01 {
    public static void main(String[] args){
        double s = 1.0;// side length
        int n = 360;// Number of angles

        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);

        for(int i = 0; i < n; i++){
            m.fd(s);
            m.rt(360.0/n);
        }
    }
}
