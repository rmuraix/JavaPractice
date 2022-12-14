import tg.*;
import javafx.scene.paint.Color;

public class P03Ex03 {
    public static void main(String[] args) {
        double x = 300.0, y = 200.0, d = 100.0; // double 型の変数を用意
        TurtleFrame f = new TurtleFrame(700.0, 500.0); // 引数のあるコンストラクタ呼出し
        Turtle m = new Turtle(x, y, 180.0);
        Turtle m1 = new Turtle(x + d, y + d, 0.0);
        javafx.scene.paint.Color c = new Color(0.8, 0.0, 0.0, 1.0); // 赤色
        m1.setColor(c); // m1 の色を作成した色オブジェクト)に指定
        f.add(m); // ` f に m を追加`
        f.add(m1); // ` f に m1 を追加`
        m.fd(100.0); // ` m よ前に 100 進め`
        m.rt(90.0); // ` m よ右に 90 度回れ`
        m.fd(150.0); // ` m よ前に 150 進め`
        m1.rt(90.0); // ` m1 よ前に 100 進め`
        m1.fd(100);
    }
}
