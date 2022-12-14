package at.har.games.firstgame;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor{
    private float x,y,speed;

    public Ellipse(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 20);
    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;
        if (y>600-10){
            this.y = 0;
        }
        if (x>800-10){
            this.x = 0;
        }
    }
}
