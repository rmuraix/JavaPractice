import tg.*;

public class T91Inst {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        // HTurtle �𐶐����� Turtle �^�� m �ɑ��
        Turtle m = new HTurtle();

        // �������^�������
        if (args.length > 0) {
            m = new HTurtle();
            System.out.println("��Hturtle�𐶐����܂���");
        } else {
            m = new Turtle();
            System.out.println("��Turtle�𐶐����܂���");
        }
        f.add(m);
        // m��Turtle��HTurtle�ǂ���̉\��������
        m.fd(100);
        m.rt(36);
        turtleStar(m);
    }

    static void turtleStar(Turtle t) {
        // �N���X���`�F�b�N
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
