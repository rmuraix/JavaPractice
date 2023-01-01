package graph;
import math.*;

import math.Newton;
import tg.*;

public class GraphDrawer {
    double a = 3.5; // fun のパラメータ

    double fun(double x) { // 描画する関数
        return a * x * (1 - x);
    }
    double fun1(double x){
        return -a * x * (1 - x) + 1;
    }
    double funnewton(double x){
        return Newton.newton(x);
    }
    double funcircleX(double x){
        return 0.5 * Math.cos(Math.toRadians(x)) + 0.5;
    }
    double funcircleY(double x){
        return 0.5 * Math.sin(Math.toRadians(x)) + 0.5;
    }
    

    double width = 400; // 画面の横幅
    TurtleFrame f;
    GTurtle m;

    GraphDrawer() { // コンストラクター
        f = new TurtleFrame(width, width);
        m = new GTurtle();
        f.add(m);
        f.addMesh();
    }

    void start() { // 処理の本体
        m.drawGraph();
    }

    public static void main(String[] args) { // main メソッド
        GraphDrawer gd = new GraphDrawer();
        gd.start();
    }

    class GTurtle extends Turtle { // 内部クラスGTurtle
        void drawGraph() { // グラフ描画メソッド
            up();
            dMoveTo(funcircleX(0), funcircleY(0));
            down();
            for (double x = 0; x < 360; x++) {
                dMoveTo(funcircleX(x), funcircleY(x));
            }
        } // グラフ内座標を用いた移動メソッド

        void dMoveTo(double x, double y) {
            moveTo(x * width, (1 - y) * width);
        }
    }
}
