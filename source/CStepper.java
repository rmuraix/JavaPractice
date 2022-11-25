import tg.*;

public class CStepper extends Turtle {
    private int n;
    private double size;
    private int j = 0;

    public CStepper(int n, double size) {
        this.n = n; // �C���X�^���X�t�B�[���h n �� ���� n ��ݒ�
        this.size = size; // �C���X�^���X�t�B�[���h size �̐ݒ�
    }

    public CStepper(int n, double size, int x, int y, int angle) {
        super(x, y, angle); // Turtle �̃R���X�g���N�^�ďo��
        this.n = n;
        this.size = size;
    }

    public void step() {
        if (j >= n)
            return; // �`���I���Ă����Ȃ炷���I��
        fd(size);
        rt(360.0 / n);
        j++; // j �̒l�� 1 ���₷
    }
}
