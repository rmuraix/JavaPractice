import tg.*;
import javafx.scene.paint.*;

public class P05Ex02 {
    public static void main(String[] args) {
        double d = 100, x, y, a;
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle(200, 300, 0);
        f.add(m);
        m.fd(d);
        x = m.getX(); // m ��X ���W�̂Ƃ�o��
        y = m.getY(); // m ��Y ���W�̂Ƃ�o��
        a = m.getAngle() - 45; // m �̊p�x�̂Ƃ�o��
        Turtle m1 = new Turtle(x, y, a); // m1 �̍쐬
        f.add(m1);
        m1.fd(d);
        Turtle.speedAll(1);
        Turtle m2 = m.clone(); // m2 �̍쐬
        f.add(m2);
        m.rt(45);
        m.fd(d);
        double newscale = m2.tScale * 4; // m2 �� tScale �� 4 �{�̐�
        Turtle.speedAll(4);
        m2.tScale = newscale; // m2 �� tScale �ɑ��
        m2.tColor = new Color(0.0, 1.0, 1.0, 1.0); // m2 �̋T�̐F�𐅐F�ɕς���
        m2.fd(d);
        Point p = f.getMousePosition();
        m2.moveTo(p.x, p.y);
    }
}
