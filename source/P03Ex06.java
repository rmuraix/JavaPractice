import tg.*;

public class P03Ex06 {
    public static void main(String[] args){
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        m.up();
        Point p = f.getMousePosition();
        m.moveTo(p.x, p.y, 0);
        m.down();
        for (int i = 0; i < 10; i++){
            p = f.getMousePosition();
            m.moveTo(p.x, p.y, 0);    
        }
        f.remove(m);
    }

}
