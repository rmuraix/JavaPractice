import tg.*;

public class Stepper extends Turtle{
    public int n;                         //���J���ꂽ�C���X�^���X�t�B�[���h n �̐錾 
    public double size;                //���J���ꂽ�C���X�^���X�t�B�[���h size �̐錾 
    private int j = 0;              //�i����J�j�C���X�^���X�t�B�[���h j �̐錾 
    public void step() {  
        if(j >= n)
            return;                //�`���I���Ă����Ȃ炷���I��
        fd(size);
        rt(360.0/n);
        j++;                        //j �̒l�� 1 ���₷
    } 
}
