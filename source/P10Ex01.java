import tg.*;

public class P10Ex01 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(700, 300);
        // �z��I�u�W�F�N�g�𐶐�
        HTurtle[] hm = new HTurtle[13];
        for (int i = 0; i < hm.length; i++) {
            // HTurtle �𐶐��C�z��̊e�v�f�ɑ��
            hm[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(hm[i]);
        }
        for (int i = 0; i < hm.length; i++) {
            // hm[i] �ɑ������Ă��� HTurtle �ւ̃��\�b�h�Ăяo��
            hm[i].polygon(i + 3, 10);
        }
    }
}
