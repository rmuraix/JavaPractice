// インスタンス変数は初期化されずnが加算されたことを保持できるが、
// PolygonTurtleNG内のローカル変数はメソッドが再び呼び出された時に3で初期化される。
// そのためずっと三角形になってしまう。

import tg.*;

public class P08Ex04 {
    public static void main(String[] args) {
        int n = 8;
        TurtleFrame f = new TurtleFrame(900, 400);
        PolygonTurtle p1 = new PolygonTurtle();
        PolygonTurtleNG p2 = new PolygonTurtleNG();

        f.add(p1);
        f.add(p2);

        p1.up();
        p1.moveTo(50, 100, 0);
        p1.down();

        p2.up();
        p2.moveTo(50, 250, 0);
        p2.down();

        p1.rt(90);
        p2.rt(90);

        for (int i = 1; i < n; i++) {
            p1.draw();
            p1.fd(100);
            p2.draw();
            p2.fd(100);
        }
    }
}