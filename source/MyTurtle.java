import tg.*;

// Extend HTurtle
public class MyTurtle extends HTurtle {
    public void star(double s) { // Define polygon method
        // draw star
        for (int i = 0; i < 5; i++) {
            this.rt(144.0);
            this.fd(s);
        }
    }

    // Number of angles, Number of shape, Length, Space bitween shapes
    public void polygons(int n, int m, double s, double w) {

        for (int i = 0; i < m; i++) {
            // draw shape
            this.polygon(n, s);

            this.up();
            this.rt(180.0);
            this.fd(s);
            this.fd(w);
            this.rt(180.0);
            this.down();
        }

    }

    // size, Number of houses, Space bitween houses
    public void houses(double s, int n, double w) {
        for (int i = 0; i < n; i++) {
            this.house(s);

            this.up();
            this.rt(90.0);
            this.fd(s);
            this.fd(w);
            this.lt(90);
            this.down();

        }
    }
}
