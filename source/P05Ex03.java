public class P05Ex03 {
    public static void main(String[] args) {
        double num;
        for (int i = 1; i <= 20; i++) {
            num = (Math.random() + 1) * 3;
            System.out.println(i + "time:" + num);
        }
    }
}
