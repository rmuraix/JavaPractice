public class P06Ex05 {
    public static void showHello() {
        System.out.println("Hello!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        showHello();
        System.out.println(sum(3, 5));
        System.out.println(sum(3.5, 5.5));
        System.out.println(multi(3.5, 5.5));

    }

}
