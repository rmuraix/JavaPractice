import tg.*;

public class P10Ex06 {
    public static void main(String[] args) {
        int n = 0;
        int s = 0;

        try {
            n = Integer.parseInt(args[0]);
            s = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("�����̌`��������������܂���B���l����͂��Ă��������B");
            System.exit(1);
        }

        System.out.println("�p�̐�:" + args[0]);
        System.out.println("�}�`�̑傫��:" + args[1] + "\n�ŕ`�悳��܂��B");
        if (args.length > 2) {
            System.out.println("�ȉ��̈����͎g�p����܂���B\n");
            for (int i = 2; i < args.length; i++) {
                System.out.println((i + 1) + "�Ԗڂ̈���:" + args[i]);
            }
        }

        TurtleFrame f = new TurtleFrame();
        HTurtle m = new HTurtle();
        f.add(m);

        m.polygon(n, s);

    }
}