import tg.*;
public class P02Ex01 {   
    public static void main(String[] args){
        TurtleFrame f;                    //`�ϐ� f �̌^�錾`
        f =  new TurtleFrame();      //`TurtleFrame���쐬��f�ɑ��`
        Turtle m = new Turtle();    //`Turtle ���쐬���Cm �̏����l�Ƃ��đ��`
        Turtle m1 = new Turtle();  //`������쐬���Cm1 �̏����l�Ƃ��đ��`
        f.add(m);                         //` f �� m ��ǉ�`
        f.add(m1);
        m.fd(100.0);                     //` m ��O�� 100 �i��`
        m.rt(90.0);                      //` m ��E�� 90 �x���`
        m.fd(150.0);                    //` m ��O�� 150 �i��`
        m1.rt(90.0);                  //` m1 ��O�� 100 �i��`
        m1.fd(100);                       //` f �� m1 ��ǉ�`
        for(int i = 0; i < 5; i++){
            m.fd(30.0);
            m.rt(144.0);
        }
        for(int i = 0; i < 5; i++){
            m1.fd(30.0);
            m1.rt(144.0);
        }
    }     
}