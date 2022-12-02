import tg.*;

public class P10Ex03 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(600, 300);
        // 配列オブジェクトを生成
        HTurtle[] hm = new HTurtle[10];
        for (int i = 0; i < 10; i++) {
            // HTurtle を生成，配列の各要素に代入
            hm[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(hm[i]);
        }
        for (HTurtle m : hm) {
            // mに代入されている HTurtle へのメソッド呼び出し
            m.polygon(6, 10);
        }
    }
}
