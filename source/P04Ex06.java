import tg.*;
import javafx.scene.paint.Color;

public class P04Ex06 {
    public static void main(String[] args){
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        int i = 0;
        f.add(m);
        for (;;){
            m.up();

            Point p = f.getMousePosition();
            m.moveTo(p.x, p.y, 0);

            i++;

            if(i % 3 == 0){
                m.setColor(Color.RED);
            }else if (i % 3 == 1) {
                m.setColor(Color.GREEN);
            }else{
                m.setColor(Color.YELLOW);
            }

            m.down();
            // drawing star
            for(int k = 0; k < 5; k++){
                m.rt(144.0);
                m.fd(50.0);
            }
        }
    }
}
