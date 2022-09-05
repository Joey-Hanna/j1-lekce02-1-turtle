package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();



        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                zofka.move(150);
                zofka.turnRight(90);
            }

            zofka.turnLeft(45);
            zofka.move(100);
            zofka.turnRight(45);
            zofka.turnRight(45);
            zofka.move(100);

            zofka.penUp();
            zofka.turnRight(45);
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.turnLeft(90);

            zofka.penDown();

        }













    }

}
