import tg.*;
public class P02Ex03 {   
    public static void main(String[] args){
        TurtleFrame f;                    //`�ϐ� f �̌^�錾`
        f =  new TurtleFrame();      //`TurtleFrame���쐬��f�ɑ��`
        Turtle murai = new Turtle();    //`Turtle ���쐬���Cm �̏����l�Ƃ��đ��`
        f.add(murai);                         //` f �� m ��ǉ�`
        for(int i = 0; i < 5; i++){ // �� 
            murai.rt(144.0);
            murai.fd(50.0);   
        }

        murai.fd(50.0);

        for(int i = 0; i < 3; i++){ // �O�p�`
            murai.rt(120.0);
            murai.fd(50.0);   
        }

        murai.fd(50.0);
        
        for(int i = 0; i < 4; i++){ // �l�p�`
            murai.rt(90.0);
            murai.fd(50.0);   
        }
    }     
}