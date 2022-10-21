import tg.*;
import javafx.scene.paint.*;

public class P03Ex07 {
    public static void main(String[] args) {
        double d = 100, x, y, a;
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle(200, 300, 0);
        Turtle.speedAll(4);
        f.add(m);
        m.tScale *= 4;
        m.tColor = new Color(1, 0, 0, 1);
        m.fd(d);
        x = m.getX(); // m のX 座標のとり出し
        y = m.getY(); // m のY 座標のとり出し
        a = m.getAngle() - 45; // m の角度のとり出し
        System.out.println("分岐点の座標:" + x + "," + y);
        Turtle m1 = new Turtle(x, y, a); // m1 の作成
        f.add(m1);
        m1.tScale *= 4;
        m1.tColor = new Color(0, 0, 1, 1);
        m1.fd(d);
        Turtle m2 = m.clone(); // m2 の作成
        f.add(m2);
        m.rt(45);
        m.fd(d);
        m2.tColor = new Color(0.0, 1.0, 0, 1.0); // m2 の亀の色を水色に変える
        m2.fd(d);
        Point p = f.getMousePosition();
        m2.moveTo(p.x, p.y);
        System.out.println("赤の亀の座標:" + m.getX() + "," + m.getY());
        System.out.println("青の亀の座標:" + m1.getX() + "," + m1.getY());
        System.out.println("緑の亀の座標:" + m2.getX() + "," + m2.getY());

    }
}
