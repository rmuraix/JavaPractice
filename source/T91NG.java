import tg.*;

public class T91NG {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        // HTurtle ‚ğ¶¬‚µ‚Ä Turtle Œ^‚Ì m ‚É‘ã“ü
        Turtle m = new HTurtle();

        // ˆø”‚ª—^‚¦‚ç‚ê‚ê‚Î
        if (args.length > 0) {
            m = new HTurtle();
            System.out.println("œHturtle‚ğ¶¬‚µ‚Ü‚µ‚½");
        } else {
            m = new Turtle();
            System.out.println("›Turtle‚ğ¶¬‚µ‚Ü‚µ‚½");
        }
        f.add(m);
        // m‚ÍTurtle‚ÆHTurtle‚Ç‚¿‚ç‚Ì‰Â”\«‚à‚ ‚é
        m.fd(100);
        m.rt(36);
        turtleStar(m);
    }

    static void turtleStar(Turtle t) {
        for (int i = 0; i < 5; i++) {
            t.fd(100);
            t.rt(144);
        }
        // ŒÜŠpŒ`‚ğ‘‚­
        // t‚ªHTurtle‚È‚ç¬Œ÷‚·‚é
        HTurtle hm = (HTurtle) t;
        hm.polygon(5, 100);
    }
}
