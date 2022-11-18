// �C���X�^���X�ϐ��͏��������ꂸn�����Z���ꂽ���Ƃ�ێ��ł��邪�A
// PolygonTurtleNG���̃��[�J���ϐ��̓��\�b�h���ĂьĂяo���ꂽ����3�ŏ����������B
// ���̂��߂����ƎO�p�`�ɂȂ��Ă��܂��B

import tg.*;

public class P08Ex04 {
    public static void main(String[] args) {
        int n = 8;
        TurtleFrame f = new TurtleFrame(900, 400);
        PolygonTurtle p1 = new PolygonTurtle();
        PolygonTurtleNG p2 = new PolygonTurtleNG();

        f.add(p1);
        f.add(p2);

        p1.up();
        p1.moveTo(50, 100, 0);
        p1.down();

        p2.up();
        p2.moveTo(50, 250, 0);
        p2.down();

        p1.rt(90);
        p2.rt(90);

        for (int i = 1; i < n; i++) {
            p1.draw();
            p1.fd(100);
            p2.draw();
            p2.fd(100);
        }
    }
}