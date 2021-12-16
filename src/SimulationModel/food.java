package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This is a class
 * Created 2021-11-15
 *
 * @author Magnus Silverdal
 */
public class food {
    public static int x;
    public static int y;

    public food(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
        int randomNum1 = ThreadLocalRandom.current().nextInt(0,  25);
        int randomNum2 = ThreadLocalRandom.current().nextInt(0,  25);

        if(snake.x == this.x && snake.y == food.y){
            this.x = randomNum1;
            this.y = randomNum2;
        }
    }

    public Sprite getSprite() {
        return null;
    }

}
