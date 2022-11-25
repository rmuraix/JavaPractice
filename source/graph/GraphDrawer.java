package graph;
import math.*;

import math.Newton;
import tg.*;

public class GraphDrawer {
    double a = 3.5; // fun �̃p�����[�^

    double fun(double x) { // �`�悷��֐�
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
    

    double width = 400; // ��ʂ̉���
    TurtleFrame f;
    GTurtle m;

    GraphDrawer() { // �R���X�g���N�^�[
        f = new TurtleFrame(width, width);
        m = new GTurtle();
        f.add(m);
        f.addMesh();
    }

    void start() { // �����̖{��
        m.drawGraph();
    }

    public static void main(String[] args) { // main ���\�b�h
        GraphDrawer gd = new GraphDrawer();
        gd.start();
    }

    class GTurtle extends Turtle { // �����N���XGTurtle
        void drawGraph() { // �O���t�`�惁�\�b�h
            up();
            dMoveTo(funcircleX(0), funcircleY(0));
            down();
            for (double x = 0; x < 360; x++) {
                dMoveTo(funcircleX(x), funcircleY(x));
            }
        } // �O���t�����W��p�����ړ����\�b�h

        void dMoveTo(double x, double y) {
            moveTo(x * width, (1 - y) * width);
        }
    }
}
