import tg.*;

public class P11Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        // HTurtle �𐶐����� Turtle �^�� m �ɑ��
        Turtle m = new HTurtle();

        // �������^�������
        if (args[0].equals("H")) {
            m = new HTurtle();
            System.out.println("��Hturtle�𐶐����܂���");
        } else if (args[0].equals("M")) {
            m = new MyTurtle();
            System.out.println("��MyTurtle�𐶐����܂���");
        } else if (args[0].equals("T")) {
            m = new Turtle();
            System.out.println("Turtle�𐶐����܂���");
        } else {
            System.out.println("����������������܂���");
            System.exit(1);
        }
        f.add(m);

        m.fd(100);
        m.rt(36);
        turtleStar(m);
    }

    static void turtleStar(Turtle t) {
        // �N���X���`�F�b�N
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
