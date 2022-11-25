
// Extend HTurtle
public class MyTurtle extends HTurtle1 {
    /** コンストラクタ,練習問題 5.13 で追加。*/  
    public MyTurtle(double x, double y, double angle) {
        super(x, y, angle);
    }

    /**
     * このコンストラクタがないと,サブクラスでデフォルトのコンストラクタが使えなくなる。*/
     

    public MyTurtle() {
        super();
    }

    public void star(double s) { // Define polygon method
        // draw star
        for (int i = 0; i < 5; i++) {
            this.fd(s);
            this.rt(144.0);

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

    public void polygons(int n, int m, double s, double w, double x, double y) {
        up();
        moveTo(x, y, 0);
        down();
        this.polygons(n, m, s, w);

    }

    public double polygon(int n, double s, double x, double y) {
        up();
        moveTo(x, y, 0);
        down();
        return this.polygon(n, s);
    }

    // size, Number of houses, Space bitween houses
    public double houses(double s, int n, double w) {
        double len = 0.0;
        for (int i = 0; i < n; i++) {
            len = this.house(s);

            this.up();
            this.rt(90.0);
            this.fd(s);
            this.fd(w);
            this.lt(90);
            this.down();

        }
        return len;
    }

    public double houses(double s, double x, double y, int n, double w) {
        up();
        moveTo(x, y, 0);
        down();
        return this.houses(s, n, w);
    }

    // number of loop, number of corners, size
    public void pPolygon(int n, int m, int s) {
        for (int i = 0; i < n; i++) {
            polygon(m, s);
            fd(s);
            lt(360 / n);
        }
    }

    public void house(double s, double x, double y) {
        up();
        moveTo(x, y, 0);
        down();
        super.house(s);
    }

    public void flower(int n, double s, double r) {
        for (int i = 0; i < r; i++) {
            super.polygon(n, s);
            rt(360 / r);
        }
    }

    // size, number of stars, Space bitween stars
    public void stars(double s, int n, double w) {
        for (int i = 0; i < n; i++) {
            this.star(s);
            this.up();
            // reset angle
            this.moveTo(this.getX(), this.getY(), 0);
            this.rt(90);
            this.fd(w);
            this.lt(90);
            this.down();
        }
    }

}
