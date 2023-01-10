package at.har.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();
        MoveStrategy mr1 = new MoveRight(0, 0, 0.3f);
        MoveStrategy mr2 = new MoveLeft(500, 100, 0.1f);


        this.actors.add(new Circle(mr1));
        this.actors.add(new Circle(mr2));


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
