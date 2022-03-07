package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board; 

    int size;

    float cellSize;
    PApplet pa; 

    public LifeBoard(int size, PApplet pa)
    {
        board = new boolean[size][size];
        this.size = size; 
        this.pa = pa;
        cellSize = pa.width / (float) size;
    }

    public void randomise()
    {
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            { 
               board[row][col] = pa.random(1.0f) > 0.5f; 
            }  
        }
    }

    public void render(){
        for(int i = 0; i < size; i++ )
        {
            for(int j = 0; j < size; j++)
            {
                pa.fill(board[i][j] ? 255 : 0 );
                pa.rect(j*cellSize, i*cellSize, cellSize, cellSize);
            }
        }
    }
    
}
