import tg.*;

public class Tensasen extends HTurtle {
    double psize = 10;
    double psize1 = 3;

    @Override
    public void fd(double s) {
        int k;
        double len;
        for (k = 0, len = 0; len + psize <= s; k++, len += psize) {
            switch (k % 4) {
                case 0:
                    down();
                    super.fd(psize);
                    break;
                case 1:
                    up();
                    super.fd(psize1);
                    break;
                case 2:
                    down();
                    super.fd(psize1);
                    break;
                case 3:
                    up();
                    super.fd(psize1);
                default:
                    break;
            }
        }
        down();
        super.fd(s - len);
    }

    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Tensasen m = new Tensasen();
        f.add(m);
        m.fd(100);
        m.rt(90);
        m.up();
        m.fd(100);
        m.down();
        m.lt(90);
        m.polygon(5, 50);
    }
}
