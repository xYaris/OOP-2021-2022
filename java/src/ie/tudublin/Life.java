package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {
	
	LifeBoard board;



	LifeBoard board;

	public void settings() {
		size(500, 500);
<<<<<<< HEAD
		board = new LifeBoard(100, this);
		board.randomise();
	
=======
		board = new LifeBoard(20, this);
		board.randomise();
		println(board.countCellsAround(1, 1));

>>>>>>> 2c680b9211367ad8938fa7297a2e903dfe3cf86a
	}

	public void setup() {
		colorMode(RGB);

	}

	
	public void draw() {
		board.render();
<<<<<<< HEAD
	
=======
>>>>>>> 2c680b9211367ad8938fa7297a2e903dfe3cf86a
	}
}
