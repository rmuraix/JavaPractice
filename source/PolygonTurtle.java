import tg.*;

public class PolygonTurtle extends HTurtle {
    private int n = 3; // インスタンス変数
    private int len = 50;

    public void draw() {
        double s = len * Math.sin(Math.PI / n) * 2;
        polygon(n, s);
        n++;
    }
}