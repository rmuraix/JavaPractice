
public class Student {

    private String name;

    private int english;

    private int math;

    private int japanese;

    public Student(String name) {
        this(name, 0, 0, 0);
    }

    /**
     * �R���X�g���N�^
     * 
     * @param name     ���O
     * @param english  �p��̓_��
     * @param math     ���w�̓_��
     * @param japanese ����̓_��
     */
    public Student(String name, int math, int english, int japanese) {
        this.name = name;
        this.english = english;
        this.math = math;
        this.japanese = japanese;
    }

    public String getName() {
        return this.name;
    }

    public int getEnglish() {
        return this.english;
    }

    public int getMath() {
        return this.math;
    }

    public int getjapanese() {
        return this.japanese;
    }

    public int getSum() {
        return this.english + this.math + this.japanese;
    }

    public double getAverage() {
        return (double) this.getSum() / 3;
    }
}