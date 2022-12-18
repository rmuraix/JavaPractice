import tg.*;
import javafx.scene.paint.Color;

public class PTurtle extends Turtle implements Drawable {
    /** gr �̔z��ŗ^����ꂽ�܂����`��*/ 
    public void draw(double[] gr, double x, double y) {
        up();
        for (int i = 0; i < gr.length / 2; i++) {
            moveTo(gr[i * 2] + x, gr[i * 2 + 1] + y);
            down();
        }
    }

    /** gr �ŗ^����ꂽ�܂���̔z���`��*/ 
    public void draw(double[][] grs, double x, double y) {
        for (int i = 0; i < grs.length; i++) {
            draw(grs[i], x, y);
        }
    }

    /** Turtle �N���X�̎����Ă���C�̋T�̊G��`��*/ 
    public void draw() {
        setColor(Color.RED);
        draw(turtleFig, 150, 200);
        setColor(Color.BLUE);
        draw(turtleRFig, 200, 200);
        setColor(Color.LIME);
        draw(turtleLFig, 250, 200);
    }

    /** �Ă΂��x��, �قȂ�G��`��*/ 
    int turn = 0;
    double[][][] figs = { turtleFig, turtleRFig, turtleLFig };

    public void draw(double x, double y) {
        draw(figs[turn++ % 3], x, y);
    }

    /** �܂���̍��W����ϊ������܂���𐶐�*/ 
    static double[] trans(double[] gr, int th, double s) {
        double xx, yy;
        double ra = th * Math.PI / 180;
        double[] na = new double[gr.length];
        for (int i = 0; i < gr.length / 2; i++) {
            xx = gr[i * 2];
            yy = gr[i * 2 + 1];
            na[i * 2] = (int) (s * (xx * Math.cos(ra) - yy *
                    Math.sin(ra)));
            na[i * 2 + 1] = (int) (s * (xx * Math.sin(ra) + yy *
                    Math.cos(ra)));
        }
        return na;
    }

    /** �܂���̔z��ɑ΂��ē������Ƃ��s��*/ 
    static double[][] trans(double[][] gr, int th, double s) {
        double[][] aaa = new double[gr.length][];
        for (int i = 0; i < gr.length; i++) {
            aaa[i] = trans(gr[i], th, s);
        }
        return aaa;
    }

    /** �e���\�b�h������ɓ����Ă��邩���ׂ邽�߂̃T���v���v���O����*/ 
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        PTurtle m = new PTurtle();
        f.add(m);
        m.draw();
        m.draw(100, 100);
        m.draw(150, 100);
        m.draw(200, 100);
        m.draw(250, 100);
        m.setColor(Color.PINK);
        m.draw(trans(turtleFig, 0, 0.3), 50, 300);
        m.draw(trans(turtleFig, 30, 0.5), 100, 300);
        m.draw(trans(turtleFig, 60, 0.7), 150, 300);
        m.draw(trans(turtleFig, 90, 1.0), 200, 300);
        m.draw(trans(turtleFig, 120, 2.0), 300, 300);
    }
}