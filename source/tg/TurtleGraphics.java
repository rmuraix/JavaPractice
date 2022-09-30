package tg;
//
//Turtle Graphics Library for the book "Java for Everyone, 3rd Edition".
//Copyright (C) 2000, 2006, 2016, Hideki Tsuiki, Kyoto University

import java.util.concurrent.CountDownLatch;

import javafx.application.Application;
import javafx.stage.Stage;

/** Turtle Graphics �̃��C���� Application�B
 * �ʏ�́ATurtleFrame �̍ŏ��̍쐬�̎��� starter() ���Ă΂��B
 * ����ɂ��Alaunch ��ʃX���b�h�ŌĂяo���B
 * starter() �́Astart() ���I����Ă���Ԃ�悤�ɂ��Ă���B
 */
public class TurtleGraphics extends Application{
	static boolean initialized = false;
	static CountDownLatch cd = new CountDownLatch(1);
	static void starter(){
		if(!initialized){
			(new Thread(()-> launch())).start();
		}
		try{cd.await();}catch(InterruptedException e){}
	}
	@Override
	public void start(Stage pstage){
		initialized = true;
		cd.countDown();
	}
}
