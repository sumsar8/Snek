package SimulationModel;

import java.util.concurrent.ThreadLocalRandom;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    snake s;
    food f;
    public SimulationModel() {
        s = new snake(1,1,2);
        f = new food(5,1);
    }
    public void update() {
        s.update();
        f.update();
        int randomNum1 = ThreadLocalRandom.current().nextInt(0, 8 + 1);
        int randomNum2 = ThreadLocalRandom.current().nextInt(0, 8 + 1);

        if(s.x == f.x && s.y == f.y){
            f.x = randomNum1;
            f.y = randomNum2;
        }
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s.getShape());
        shapes.add(f.getShape());
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(s.getSprite());
        sprites.add(f.getSprite());
        return sprites;
    }
    public int getfoodx(){
        return f.x;
    }
}
