package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    LifeBoard board;


    public void settings() {
        size(500, 500);
        board = new LifeBoard(100, this);
        board.randomise();
        println(board.countCellsAround(1, 1));
    }

    public void setup() {
        colorMode(HSB);
    }


    public void draw() {
        board.render();
		board.update();
    }
}