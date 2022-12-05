package at.har.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
    private Direction direction;
    private float x;
    private float y;
    private float speed;

    public Rectangle(int x, int y, float speed, Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    public void update(int delta) {
        switch (this.direction) {
            case UP:
                this.y -= this.speed * (float)delta;
                if (y<0){
                    this.y = 600;
                }
                break;
            case DOWN:
                this.y += this.speed * (float)delta;
                if (y>600-10){
                    this.y = 0;
                }
                break;
            case LEFT:
                this.x -= this.speed * (float)delta;
                if (x<0){
                    this.x = 800;
                }
                break;
            case RIGHT:
                this.x += this.speed * (float)delta;
                if (x>800-10){
                    this.x = 0;
                }
                break;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }


}
