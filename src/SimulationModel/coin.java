package SimulationModel;

import Shapes.Point;
import Shapes.Shape;

import java.util.concurrent.ThreadLocalRandom;

public class coin extends Shape{
    public static int x;
    public static int y;

    public coin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
        int randomNum1 = ThreadLocalRandom.current().nextInt(0,  25);
        int randomNum2 = ThreadLocalRandom.current().nextInt(0,  25);

        if(snake.x == this.x && snake.y == coin.y){
            this.x = randomNum1;
            this.y = randomNum2;
        }
    }

}
