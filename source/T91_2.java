import tg.*;

public class T91_2 {
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
        for (int i = 0; i < 5; i++) {
            t.fd(100);
            t.rt(144);
        }
    }
}
