import tg.*;

public class PolygonTurtleNG extends HTurtle {
    private int len = 50;

    public void draw() {
        int n = 3; // ローカル変数
        double s = len * Math.sin(Math.PI / n) * 2;
        polygon(n, s);
        n++;
    }
}