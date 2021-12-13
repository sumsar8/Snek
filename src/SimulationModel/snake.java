package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

/**
 * This is a class
 * Created 2021-11-15
 *
 * @author Magnus Silverdal
 */
public class snake {
    public int x;
    public int y;
    private int length;

    public snake(int x, int y, int lenght) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
        if(this.x > 1){
            this.x -= 1;

        }

    }


    public Sprite getSprite() {
        return null;
    }
}
