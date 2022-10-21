import tg.*;
import javafx.scene.paint.*;

public class P03Ex07 {
    public static void main(String[] args) {
        double d = 100, x, y, a;
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle(200, 300, 0);
        Turtle.speedAll(4);
        f.add(m);
        m.tScale *= 4;
        m.tColor = new Color(1, 0, 0, 1);
        m.fd(d);
        x = m.getX(); // m ��X ���W�̂Ƃ�o��
        y = m.getY(); // m ��Y ���W�̂Ƃ�o��
        a = m.getAngle() - 45; // m �̊p�x�̂Ƃ�o��
        System.out.println("����_�̍��W:" + x + "," + y);
        Turtle m1 = new Turtle(x, y, a); // m1 �̍쐬
        f.add(m1);
        m1.tScale *= 4;
        m1.tColor = new Color(0, 0, 1, 1);
        m1.fd(d);
        Turtle m2 = m.clone(); // m2 �̍쐬
        f.add(m2);
        m.rt(45);
        m.fd(d);
        m2.tColor = new Color(0.0, 1.0, 0, 1.0); // m2 �̋T�̐F�𐅐F�ɕς���
        m2.fd(d);
        Point p = f.getMousePosition();
        m2.moveTo(p.x, p.y);
        System.out.println("�Ԃ̋T�̍��W:" + m.getX() + "," + m.getY());
        System.out.println("�̋T�̍��W:" + m1.getX() + "," + m1.getY());
        System.out.println("�΂̋T�̍��W:" + m2.getX() + "," + m2.getY());

    }
}
