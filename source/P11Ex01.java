import tg.*;

public class P11Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        // HTurtle を生成して Turtle 型の m に代入
        Turtle m = new HTurtle();

        // 引数が与えられれば
        if (args[0].equals("H")) {
            m = new HTurtle();
            System.out.println("●Hturtleを生成しました");
        } else if (args[0].equals("M")) {
            m = new MyTurtle();
            System.out.println("○MyTurtleを生成しました");
        } else if (args[0].equals("T")) {
            m = new Turtle();
            System.out.println("Turtleを生成しました");
        } else {
            System.out.println("引数が正しくありません");
            System.exit(1);
        }
        f.add(m);

        m.fd(100);
        m.rt(36);
        turtleStar(m);
    }

    static void turtleStar(Turtle t) {
        // クラスをチェック
        if (t instanceof HTurtle) {
            ((HTurtle) t).polygon(5, 100);
        } else if (t instanceof MyTurtle) {
            ((MyTurtle) t).houses(10, 5, 10);
        } else {
            // Turtle
            for (int i = 0; i < 5; i++) {
                ((Turtle) t).fd(100);
                ((Turtle) t).rt(144);
            }

        }

    }
}
