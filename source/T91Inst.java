import tg.*;

public class T91Inst {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        // HTurtle を生成して Turtle 型の m に代入
        Turtle m = new HTurtle();

        // 引数が与えられれば
        if (args.length > 0) {
            m = new HTurtle();
            System.out.println("●Hturtleを生成しました");
        } else {
            m = new Turtle();
            System.out.println("○Turtleを生成しました");
        }
        f.add(m);
        // mはTurtleとHTurtleどちらの可能性もある
        m.fd(100);
        m.rt(36);
        turtleStar(m);
    }

    static void turtleStar(Turtle t) {
        // クラスをチェック
        if (t instanceof HTurtle) {
            ((HTurtle) t).polygon(5, 100);
        } else {
            for (int i = 0; i < 5; i++) {
                t.fd(100);
                t.rt(144);
            }
        }

    }
}
