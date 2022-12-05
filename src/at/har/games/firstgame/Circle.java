package at.har.games.firstgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{
    private float x,y,speed;
    private float diameter;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(10)+1;
        this.diameter = random.nextInt(20) + 10;
    }

    public void update(int delta){
        this.y += (float)delta/this.speed;
        if (y>600-10){
            this.y = 0;
        }

        this.diameter += 0.1;
        if (this.diameter > 50){
            this.diameter = 10;
        }
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }
}
