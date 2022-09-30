package tg;

//Turtle Graphics Library for the book "Java for Everyone, 3rd Edition".
//Copyright (C) 2000, 2006, 2016, Hideki Tsuiki, Kyoto University
//This library is developed using the code of Tatsuya Hagino's library.


//Turtle Graphics Library for Information Processing I
//Copyright (C) 1998, Tatsuya Hagino, Keio University
//
//Permission to use, copy, modify, and distribute this software
//for educational purpose only is hereby granted, provided that
//the above copyright notice appear in all copies and that both
//the copyright notice and this permission notice appear in
//supporting documentation.  This software is provided "as is"
//with no warranty.


import javafx.application.Platform; 
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.*;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.concurrent.*; 

/** �^�[�g����\������E�B���h�E�̃N���X�B */

public class TurtleFrame{ 
    private Stage mystage;    // mystage, TurtleFrame �́C�{���I�� stage.
    protected BorderPane root;
    private double width = 400, height = 400;
    private static double displayx = 100, displayy = 100;   
    // �E�B���h�E��\������f�B�X�v���C�̍��W�B
    // 2�ڈȍ~�̃E�B���h�E�͉��ɕ��ׂĕ\�������悤�ɂ����B

    private static String[] speedMenuString = {"no turtle", "very fast", "fast", "normal", "slow"};

    /*
      Stage mystage   (new TurtleFrame �Ő���)
      Scene  scene
      BorderPane root
      MenuBar menuBar
      ScrollPane sc  
      Group routgroup
      Rectangle rect     --- �{���̕`��G���A�̎l�p
      Group linegroup   ---  �`�悳��Ă����
      (Turtle ���ƂɁC�ȉ��̂���)
      Line myline           --- ���̃^�[�g���̕`�������̐� 
      Group currentTurtle   --- �^�[�g���̊G(����)
    */
        
    Group rootgroup;  // linegroup �� �^�[�g���igroup) �ƁC����O�̐�(Line) �����B
    // Turtle ������C���ڑ��삷��B
    private Group linegroup;
        
    /** TurtleFrame ���A�f�t�H���g�̑傫��(400x400) �ō쐬����B */
    public TurtleFrame(double width, double height) {
        this.width = width;
        this.height = height;
        if(!TurtleGraphics.initialized){
            TurtleGraphics.starter();  // TurtleGraphics �� Application�ł���B����� launch ���āCstart ����B
        }
        /*      JavaFX �� thread (���Ȃ킿�AApplication �� start() �����s�������\�b�h) ���������AJavaFX �� GUI ���삪
         * �ł��Ȃ��B�����ŁA�V���� TurtleFrame �̂��߂� Stage �́AFutureTask �ɍ쐬������悤�ɂ����B
         * ����� Platform.runLater �ŋN�����A�ł��� Stage �� future.get() �œ���B����ɂ��AJavaFX �� Thread ��
         *  new TurtleFrame ���s���� Thread ���������邱�ƂɂȂ�B
         */
        RunnableFuture<Stage> future = new FutureTask<Stage>( () -> new Stage());
        Platform.runLater(future);
        try {
            mystage =  future.get();
        } catch (InterruptedException | ExecutionException e) { 
            e.printStackTrace();
        }
        
        rootgroup = new Group();   //linegroup �ȊO�ɁCTurtle ���C�����̊G�ƕ`�������̐��� routgroup �ɒǉ�����B
        linegroup = new Group();
        Rectangle rect = new Rectangle(0,0,width,height);  // �����l�p���C�{���̕`��G���A
        rect.setFill(Color.WHITE);
        rect.setStrokeWidth(0.2);
        rect.setStroke(Color.BLACK);
        rootgroup.getChildren().add(rect);
        rootgroup.getChildren().add(meshlines);
        rootgroup.getChildren().add(linegroup);

        ScrollPane sp = new ScrollPane();
        sp.setContent(rootgroup);

        /* getMousePosition �̂��� */
        rootgroup.setOnMouseClicked((MouseEvent e) -> {
                mousePosition = new Point(e.getX(), e.getY()); 
                cd.countDown();
            });
                
        /*  ���j���[�o�[�̐ݒ� */
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuSpeed = new Menu("Speed");
        menuBar.getMenus().addAll(menuFile, menuSpeed);

        MenuItem menuQuit = new MenuItem("Quit");
        MenuItem menuClear = new MenuItem("Clear");
        menuClear.setOnAction((ActionEvent t) -> {clear();});
        menuFile.getItems().addAll(menuQuit, menuClear);

        menuQuit.setOnAction((ActionEvent t) -> {System.exit(0);});
        mystage.setOnCloseRequest((WindowEvent t) -> {System.exit(0);});
        //              Multi-thread �̗��ŁCthread ���c���Ă��Ă��CWindow ������ΏI�������邽�߁C
        //              Platform.exit �ł͂Ȃ� System.exit ��p�����B
                
                
        root = new BorderPane();
        root.setCenter(sp);
        root.setTop(menuBar);
        Scene scene = new Scene(root);
                
        ToggleGroup tg = new ToggleGroup();
        for (int i = 0; i < speedMenuString.length; i++) {
            RadioMenuItem m = new RadioMenuItem(speedMenuString[i]);
            m.setToggleGroup(tg);
            if(i == 0){
                m.setOnAction((ActionEvent t) -> {Turtle.setWithTurtleAll(false);});
            }else{
                final int k = i;  // �����_���ŐÓI�X�R�[�v�Ɏ�荞�ނ��߁B 
                m.setOnAction((ActionEvent t) -> {Turtle.setWithTurtleAll(true); Turtle.speedAll(k);});
            }
            if(i==3) m.setSelected(true);
            menuSpeed.getItems().add(m);
        }
        
        // stage �ɃA�N�Z�X����R�[�h�̓����_���ɂ܂Ƃ߂āAPlatform.runlater �� javaFX �X���b�h�Ɏ��s������B
        Platform.runLater(()->{
                mystage.setScene(scene);
                mystage.setTitle("TurtleFrame");
                mystage.sizeToScene();
                mystage.setX(displayx); mystage.setY(displayy);
                mystage.show();
                displayx += mystage.getWidth();
            });
        try{Thread.sleep(1000);} catch(Exception e){}  // Turtle �̍ŏ��̓������\���ł���悤�ɏ����҂�
    }

    /** TurtlePanel ���A�f�t�H���g�̑傫��(400x400) �ō쐬����B */
    public TurtleFrame() {
        this(400,400);
    }

    /* �`����s�������̓����_���ɂ܂Ƃ߂āA Platform.runLater() �ŁA
     * javaFX �X���b�h�Ɏ��s������B���ꂩ��Ăяo����� addmesh(), Turtle.show() �́A
     * javaFX �X���b�h�����s������̂ł��邱�Ƃɒ��ӁB 
     * */

    /** Turtle t ������ TurtleFrame �̏�ɒǉ�����B */
    synchronized public void add(Turtle t){
        t.setFrame(this);
    }

    /** Turtle t ������ TurtleFrame ����폜����B */
    synchronized public void remove(Turtle t)   {
        t.resetFrame();
    }

    /** ���܂łɕ`���ꂽ�S�Ă̐��������B*/
    synchronized public void clear() {
        Platform.runLater(()->{
                linegroup.getChildren().clear();
            });
    }

    /* ��ʏ�� Line ��ǉ��B Turtle �� fd() �̍Ō�ɌĂяo���B*/
    synchronized void addLineElement(double xx, double yy, double x, double y, Color c, double width)   {
        Line newline = new Line(xx,yy,x,y);
        newline.setStroke(c);
        newline.setStrokeWidth(width);
        Platform.runLater(()->{
                linegroup.getChildren().addAll(newline);
            });
    }

    static Color meshMoreDark = Color.rgb(120,120,120);
    static Color meshDark = Color.rgb(180,180,180);
    static Color meshLight = Color.rgb(230,230,150);

    Group meshlines = new Group();

    public void addMesh()      {
        for(int x = 0; x < width; x+= 10){
            Line l = new Line(x,0,x,height);
            l.setStrokeWidth(0.5);
            if(x % 100 == 0)    l.setStroke(meshMoreDark);
            else if(x % 50 == 0)        l.setStroke(meshDark);
            else                l.setStroke(meshLight);
            Platform.runLater(()->{
                    meshlines.getChildren().add(l);
                });
        }
        for(int x = 0; x < height; x+= 10){
            Line l = new Line(0,x,width,x);
            l.setStrokeWidth(0.5);
            if(x % 100 == 0)    l.setStroke(meshMoreDark);
            else if(x % 50 == 0)        l.setStroke(meshDark);
            else                l.setStroke(meshLight);
            Platform.runLater(()->{
                    meshlines.getChildren().add(l);
                });
        }
    }

    public void addControlArea(){
        Rectangle red = new Rectangle(10, 10,Color.RED);  // �Ԃ��C�{�^���p�̃G���A
        Rectangle blue = new Rectangle(10, 10,Color.BLUE);  // �Ԃ��C�{�^���p�̃G���A
        blue.setTranslateX(10);
        Platform.runLater(()->{
                rootgroup.getChildren().addAll(red,blue);
            });
    }
 


    // mouse position �𓾂邽�߁B
    private CountDownLatch cd = new CountDownLatch(0);  // dummy
    private Point mousePosition;
        
    public Point getMousePosition(){
        cd = new CountDownLatch(1);
        try{cd.await();}catch(InterruptedException e){}
        return mousePosition;
    }
}

