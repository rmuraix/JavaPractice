import tg.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class P04Ex07 {
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
        
            switch(i % 5){
                case 0:
                    m.setColor(Color.GREEN);
                    break;
                case 1:
                    m.setColor(Color.RED);
                    break;
                case 2:
                    m.setColor(Color.YELLOW);
                    break;
                case 3:
                    m.setColor(Color.BLACK);
                    break;
                case 4:
                    m.setColor(Color.HOTPINK);
            }

            m.down();
            // drawing star
            Random rand = new Random(); 
            int num = (rand.nextInt(10) + 1) * 10;
            for(int k = 0; k < 5; k++){
                m.rt(144.0);
                m.fd(num);
            }
        }
    }
}
