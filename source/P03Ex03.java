import tg.*; 
import javafx.scene.paint.Color;
public class P03Ex03 {
    public static void main(String[] args){
        double x = 300.0, y = 200.0, d = 100.0;             // double �^�̕ϐ���p��
        TurtleFrame f = new TurtleFrame(700.0, 500.0);  //�����̂���R���X�g���N�^�ďo��
        Turtle m = new Turtle(x, y, 180.0);    
        Turtle m1 = new Turtle(x+d, y+d, 0.0);
        javafx.scene.paint.Color c = new Color(0.8, 0.0, 0.0, 1.0);    //�ԐF
        m1.setColor(c);      //m1 �̐F���쐬�����F�I�u�W�F�N�g)�Ɏw��
        f.add(m);                         //` f �� m ��ǉ�`
        f.add(m1);                       //` f �� m1 ��ǉ�`
        m.fd(100.0);                     //` m ��O�� 100 �i��`
        m.rt(90.0);                      //` m ��E�� 90 �x���`
        m.fd(150.0);                    //` m ��O�� 150 �i��`
        m1.rt(90.0);                  //` m1 ��O�� 100 �i��`
        m1.fd(100);
    }
}
