package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    zofka.setPenWidth(5);

    // Moving the piglet a bit down to gain more space for the houses
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(50);
    zofka.turnRight(180);
    zofka.penDown();

    drawPig();

    zofka.setX(100);
    zofka.turnRight(90);

    drawHouse();

    zofka.penUp();
    zofka.move(120);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.penDown();

    for (int i = 0; i < 5; i++) {
      drawHouse();
      zofka.turnRight(90);
      zofka.penUp();
      zofka.move(100);
      zofka.turnLeft(90);
      zofka.penDown();
    }

    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(120);
    zofka.turnRight(180);
    zofka.penDown();

    drawHouse();

    zofka.setX(200);
    zofka.setY(60);
    zofka.turnRight(90);

//    Octagon and circle are not supposed to be part of the result picture
//    drawOctagon();
//
//    zofka.turnRight(180);
//    zofka.penUp();
//    zofka.move(25);
//    zofka.turnLeft(90);
//    zofka.move(80);
//    zofka.penDown();
//
//    drawCircle();
//
//    zofka.penUp();
//    zofka.move(120);
//    zofka.penDown();

    drawSun();

    zofka.setX(100);
    zofka.setY(400);
    zofka.turnLeft(90);

    drawL();
    drawE();
    drawN();
    drawK();
    drawA();
  }

  public void drawHouse() {
    for (int i = 0; i < 4; i++) {
      zofka.move(50);
      zofka.turnRight(90);
    }
    zofka.move(50);
    zofka.turnRight(45);
    zofka.move(35);
    zofka.turnRight(90);
    zofka.move(35);
    zofka.turnRight(45);
    zofka.move(50);
    zofka.turnRight(180);
  }

  public void drawLeg() {
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
  }

  public void drawPig() {
    zofka.turnLeft(90);
    drawHouse();
    zofka.turnLeft(90);
    zofka.move(50);

    // legs on the left side
    zofka.turnLeft(45);
    drawLeg();
    zofka.turnLeft(90);
    drawLeg();

    zofka.turnLeft(135);
    zofka.move(50);

    // legs on the right side
    zofka.turnLeft(45);
    drawLeg();
    zofka.turnRight(90);
    drawLeg();

    zofka.turnLeft(45);
  }

//  public void drawOctagon() {
//    for (int i = 0; i < 8; i++) {
//      zofka.move(30);
//      zofka.turnLeft(45);
//    }
//  }

//  public void drawCircle() {
//    for (int i = 0; i < 120; i++) {
//      zofka.move(2); // making the sun a bit smaller
//      zofka.turnLeft(3); // 360/120
//    }
//  }

  public void drawSunRay() {
    zofka.turnRight(90);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnRight(90);
    for (int i = 0; i < 10; i++) {
      zofka.turnLeft(3); // 360/120
      zofka.move(1); // making the sun a bit smaller
    }
  }

  public void drawSun() {
    for (int i = 0; i < 12; i++) {
      drawSunRay();
    }
  }

  public void twiceMoveAndTurnLeft() {
    for (int i = 0; i < 2; i++) {
      zofka.move(25);
      zofka.turnLeft(90);
    }
  }

  public void makeSpace() {
    zofka.penUp();
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void drawL() {
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.move(25);
    makeSpace();
  }

  public void drawE() {
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(25);
    zofka.turnLeft(180);
    twiceMoveAndTurnLeft();
    zofka.move(25);
    zofka.turnLeft(180);
    twiceMoveAndTurnLeft();
    zofka.move(25);
    makeSpace();
  }

  public void drawN() {
    zofka.move(50);
    zofka.turnRight(150);
    zofka.move(60);
    zofka.turnLeft(150);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(90);
    makeSpace();
  }

  public void drawK() {
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(25);
    zofka.turnLeft(135);
    zofka.move(35);
    zofka.turnLeft(180);
    zofka.move(35);
    zofka.turnLeft(90);
    zofka.move(35);
    zofka.turnLeft(45);
    makeSpace();
  }

  public void drawA() {
    zofka.turnRight(25);
    zofka.move(60);
    zofka.turnRight(135);
    zofka.move(60);
    zofka.turnRight(110);
    zofka.penUp();
    zofka.move(50);
    zofka.turnRight(115);
    zofka.move(30);
    zofka.turnRight(65);
    zofka.penDown();
    zofka.move(30);
    zofka.turnRight(65);
    zofka.penUp();
    zofka.move(30);
    zofka.turnLeft(65);
    makeSpace();
  }

}
