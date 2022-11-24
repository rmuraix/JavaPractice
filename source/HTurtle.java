//Turtle Graphics Library for the book "Java for Everyone, 3rd Edition".
//Copyright (C) 2000, 2006, 2016, Hideki Tsuiki, Kyoto University


import tg.*;

public class HTurtle extends Turtle { // Turtle ���g������
   public double polygon(int n, double s) { // polygon���\�b�h�̒�`
      double a = 360.0 / n; // �Ȃ���p�x�����߂Ă���
      for (int j = 0; j < n; j++) { // n ��J��Ԃ�
         fd(s); // s �O�ɐi���
         rt(a); // a �Ȃ���̂�
      }
      return n * s;
   }

   public void house(double s) { // house ���\�b�h�̒�`
      polygon(4, s); // polygon �𗘗p
      fd(s);
      rt(30);
      polygon(3, s);
      lt(30);
      bk(s); // ���Ƃ̏ꏊ�ɖ߂��Ă���
   }

   // �R���X�g���N�^�[�C���K���7.8�Œǉ��B
   public HTurtle(double x, double y, double angle) {
      super(x, y, angle);
   }

   public HTurtle() {
      super();
   }
}