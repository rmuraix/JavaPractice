import tg.*;

public class P10Ex03 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(600, 300);
        // �z��I�u�W�F�N�g�𐶐�
        HTurtle[] hm = new HTurtle[10];
        for (int i = 0; i < 10; i++) {
            // HTurtle �𐶐��C�z��̊e�v�f�ɑ��
            hm[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(hm[i]);
        }
        for (HTurtle m : hm) {
            // m�ɑ������Ă��� HTurtle �ւ̃��\�b�h�Ăяo��
            m.polygon(6, 10);
        }
    }
}
