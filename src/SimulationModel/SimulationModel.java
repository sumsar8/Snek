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
        s = new snake(1,1, 0);
        f = new food(10,1);
    }
    public void update() {
        s.update();
        f.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s.getShape());
        shapes.add(f.getShape());
        return shapes;
    }
}
