package model;

import java.util.*;


public class Grid {
    private int gridSize;
    private Card[][] grid;


    public Grid(int gridSize){
        this.gridSize = gridSize;
        grid = new Card[gridSize][gridSize];

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= (gridSize * gridSize) / 2; i++){
            numbers.add(i);
            numbers.add(i);
        }
        Collections.shuffle(numbers);

            int index = 0;
        for(int i = 0; i < gridSize; i++){
            for(int j = 0; j < gridSize; j++){
                grid[i][j] = new Card(numbers.get(index++));
        }
    }
    }


    public int getGridSize() {
        return this.gridSize;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public Card[][] getGrid() {
        return this.grid;
    }

    public void setGrid(Card[][] grid) {
        this.grid = grid;
    }


    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < gridSize; i++){
        for(int j = 0; j < gridSize; j++){
            sb.append(grid[i][j].getCardNumber()).append("\t");
        }
        sb.append("\n");
    }
    return sb.toString();
}

}
