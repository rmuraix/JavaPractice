import tg.*;

public class P02Ex01 {
    public static void main(String[] args) {
        TurtleFrame f; // `変数 f の型宣言`
        f = new TurtleFrame(); // `TurtleFrameを作成しfに代入`
        Turtle m = new Turtle(); // `Turtle を作成し，m の初期値として代入`
        Turtle m1 = new Turtle(); // `もう一つ作成し，m1 の初期値として代入`
        f.add(m); // ` f に m を追加`
        f.add(m1);
        m.fd(100.0); // ` m よ前に 100 進め`
        m.rt(90.0); // ` m よ右に 90 度回れ`
        m.fd(150.0); // ` m よ前に 150 進め`
        m1.rt(90.0); // ` m1 よ前に 100 進め`
        m1.fd(100); // ` f に m1 を追加`
        for (int i = 0; i < 5; i++) {
            m.fd(30.0);
            m.rt(144.0);
        }
        for (int i = 0; i < 5; i++) {
            m1.fd(30.0);
            m1.rt(144.0);
        }
    }
}