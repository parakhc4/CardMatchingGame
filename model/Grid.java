package model;

import java.util.*;

public class Grid {
    private int gridSize;
    private List<Card>[][] grid;

    public Grid(int gridSize){
        this.gridSize = gridSize;
        grid = new ArrayList[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                grid[i][j] = new ArrayList<>();   
                grid[i][j].add(new Card(j + 1));
            }
        }
    }


    public int getGridSize() {
        return this.gridSize;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public List<Card>[][] getGrid() {
        return this.grid;
    }

    public void setGrid(List<Card>[][] grid) {
        this.grid = grid;
    }


    @Override
    public String toString() {
        return "{" +
            " gridSize='" + getGridSize() + "'" +
            ", grid='" + getGrid() + "'" +
            "}";
    }

}
