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
    drawPig();
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

}
