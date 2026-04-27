package model;

import java.util.Random;

public class User {
    private Long id;
    private String name;
    private int bestScore;
    private Random r = new Random();

    public User(String name){
        this.name = name;
        this.id = r.nextLong();
        this.bestScore = 0;
        System.out.println("Welcome user "+this.name);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBestScore() {
        return this.bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public Random getR() {
        return this.r;
    }

    public void setR(Random r) {
        this.r = r;
    }
    
}
