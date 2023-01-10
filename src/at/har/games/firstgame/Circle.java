package at.har.games.firstgame;

import org.newdawn.slick.Graphics;

public class Circle implements Actor {
    private MoveStrategy moveStrategy;

    public Circle(MoveStrategy mr) {
        this.moveStrategy = mr;
    }

    public void update(int delta) {
        moveStrategy.update(delta);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
    }
}
