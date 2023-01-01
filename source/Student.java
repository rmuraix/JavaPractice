
public class Student {

    private String name;

    private int english;

    private int math;

    private int japanese;

    public Student(String name) {
        this(name, 0, 0, 0);
    }

    /**
     * コンストラクタ
     * 
     * @param name     名前
     * @param english  英語の点数
     * @param math     数学の点数
     * @param japanese 国語の点数
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