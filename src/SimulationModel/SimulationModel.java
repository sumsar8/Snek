package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;

public class SimulationModel {
    Scene scene;
    snake s;
    coin c;
    public SimulationModel() {
        s = new snake(1,1, 0);
        c = new coin(10,1);
    }
    public void update() {
        s.update();
        c.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s);
        shapes.add(c);
        return shapes;
    }
}
