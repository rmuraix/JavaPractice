import tg.*; 
public class P02Ex02 {
    public static void main(String[] args){
        TurtleFrame f;                    //`�ϐ� f �̌^�錾`
        f =  new TurtleFrame();      //`TurtleFrame���쐬��f�ɑ��`
        Turtle m = new Turtle();    //`Turtle ���쐬���Cm �̏����l�Ƃ��đ��`
        Turtle m1 = new Turtle();  //`������쐬���Cm1 �̏����l�Ƃ��đ��`
        f.add(m);                         //` f �� m ��ǉ�`
        f.add(m1);                       //` f �� m1 ��ǉ�`
        m.bk(100.0);                     //` m ��O�� 100 �i��`
        m.lt(90.0);                      //` m ��E�� 90 �x���`
        f.addMesh();
        m.bk(150.0);                    //` m ��O�� 150 �i��`
        m1.lt(90.0);
        m1.bk(100);
        f.clear();
    } 
}
