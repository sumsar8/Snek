package SimulationModel;

import Shapes.Point;
import Shapes.Shape;

import java.util.ArrayList;
/**
 * This is a class
 * Created 2021-11-15
 *
 * @author Magnus Silverdal
 */
public class snake {
    public static int x;
    public static int y;

    public static int lastx;
    public static int lasty;

    ArrayList<Integer> tail = new ArrayList<Integer>();

    public int length = tail.size();

    public snake(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }
    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
            this.lastx = x;
            this.lasty = y;
            this.length = tail.size() / 2;
            if(food.x == this.x){
            if(food.y > this.y){
                this.y += 1;
            }
            else if(food.y < this.y){
                this.y -= 1;
            }
        }
            if(food.x > this.x){
                this.x += 1;
            }
            if (food.x < this.x) {
                this.x -= 1;
            }
        if(this.x == food.x && this.y == food.y){
            tail.add(this.x);
            tail.add(this.y);

        }
        if(this.length > 0){
            System.out.println(this.length);
        }

    }

}

