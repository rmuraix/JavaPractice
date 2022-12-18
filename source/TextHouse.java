public class TextHouse extends AHTurtle {
    public void fd(int s) {
        out(s, '*');
    }

    public void bk(int s) {
        out(s, '-');
    }

    public void rt(int s) {
        out(s, '/');
    }

    public void lt(int s) {
        out(s, '\\');
    }

    public void out(int s, char c) {
        for (int i = 0; i < s; i++) {
            System.out.print(c);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        TextHouse a = new TextHouse();
        a.fd(20);
        a.polygon(6, 30);
        a.house(10);
    }
}
