package at.har.games.snowworld;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Snowflake implements Actor{

    public enum SIZE {SMALL, MEDIUM, LARGE}
    private int size;
    private float x,y;
    private int speed;
    private Random random;

    public Snowflake(SIZE size){
        this.random = new Random();
        if(size == SIZE.LARGE){
            this.size = 3;
            this.speed = 2;
        }
        else if(size == SIZE.MEDIUM){
            this.size = 8;
            this.speed = 5;
        }
        else if(size == SIZE.SMALL){
            this.size = 4;
            this.speed = 10;
        }

        setRandomPosition();
    }

    private void setRandomPosition(){
        this.x = this.random.nextInt(800);
        this.y = this.random.nextInt(600) - 600;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, this.size, this.size);
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        if (this.y>600){
            setRandomPosition();
        }
    }
}
