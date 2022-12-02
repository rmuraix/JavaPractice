import tg.*;

public class P10Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(700, 300);
        // 配列オブジェクトを生成
        HTurtle[] hm = new HTurtle[13];
        for (int i = 0; i < hm.length; i++) {
            // HTurtle を生成，配列の各要素に代入
            hm[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(hm[i]);
        }
        for (int i = 0; i < hm.length; i++) {
            // hm[i] に代入されている HTurtle へのメソッド呼び出し
            hm[i].polygon(i + 3, 10);
        }
    }
}
