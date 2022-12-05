package at.har.games.snowworld;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Octane implements Actor{
    private Image octane;

    public Octane() throws SlickException {
        Image tmp = new Image("C:\\Users\\David\\Documents\\HTL Dornbirn\\SWP1\\5aWI\\Games\\src\\at\\har\\games\\snowworld\\octane.png");
        this.octane = tmp.getScaledCopy(0.5f);
    }


    @Override
    public void render(Graphics graphics) {
        octane.draw(100,100);
    }

    @Override
    public void update(int delta) {

    }
}
