public class P05Ex05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            Double rand = (Math.random() + 1) * 3;
            Long num = Math.round(rand);
            System.out.println(i + "time:" + num);
        }

        System.out.println("=======");

        for (int i = 1; i <= 50; i++) {
            Double rand = (Math.random() + 1) * 10;
            Long num = Math.round(rand);
            System.out.println(i + "time:" + num);
        }
    }
}
