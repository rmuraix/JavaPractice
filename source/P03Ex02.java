import tg.*; 
public class P03Ex02 {
    public static void main(String[] args){
        double x = 300.0, y = 200.0, d = 100.0;             // double �^�̕ϐ���p��
        TurtleFrame f = new TurtleFrame(700.0, 500.0);  //�����̂���R���X�g���N�^�ďo��
        Turtle m = new Turtle(x, y, 180.0);    
        Turtle m1 = new Turtle(x+d, y+d, 0.0);
        f.add(m);                         //` f �� m ��ǉ�`
        f.add(m1);                       //` f �� m1 ��ǉ�`
        m.fd(100.0);                     //` m ��O�� 100 �i��`
        m.rt(90.0);                      //` m ��E�� 90 �x���`
        m.fd(150.0);                    //` m ��O�� 150 �i��`
        m1.rt(90.0);                  //` m1 ��O�� 100 �i��`
        m1.fd(100);
    }
}
