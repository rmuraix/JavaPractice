import tg.*;
public class P02Ex03 {   
    public static void main(String[] args){
        TurtleFrame f;                    //`変数 f の型宣言`
        f =  new TurtleFrame();      //`TurtleFrameを作成しfに代入`
        Turtle murai = new Turtle();    //`Turtle を作成し，m の初期値として代入`
        f.add(murai);                         //` f に m を追加`
        for(int i = 0; i < 5; i++){ // 星 
            murai.rt(144.0);
            murai.fd(50.0);   
        }

        murai.fd(50.0);

        for(int i = 0; i < 3; i++){ // 三角形
            murai.rt(120.0);
            murai.fd(50.0);   
        }

        murai.fd(50.0);
        
        for(int i = 0; i < 4; i++){ // 四角形
            murai.rt(90.0);
            murai.fd(50.0);   
        }
    }     
}