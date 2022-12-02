import tg.*;

public class P10Ex06 {
    public static void main(String[] args) {
        int n = 0;
        int s = 0;

        try {
            n = Integer.parseInt(args[0]);
            s = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("引数の形式が正しくありません。数値を入力してください。");
            System.exit(1);
        }

        System.out.println("角の数:" + args[0]);
        System.out.println("図形の大きさ:" + args[1] + "\nで描画されます。");
        if (args.length > 2) {
            System.out.println("以下の引数は使用されません。\n");
            for (int i = 2; i < args.length; i++) {
                System.out.println((i + 1) + "番目の引数:" + args[i]);
            }
        }

        TurtleFrame f = new TurtleFrame();
        HTurtle m = new HTurtle();
        f.add(m);

        m.polygon(n, s);

    }
}