package SimulationModel;

import Shapes.Point;
import Shapes.Shape;

public class snake extends Shape{
    public static int x;
    public static int y;
    public static int balance;

    public snake(int x, int y, int balance) {
        this.x = x;
        this.y = y;
        this.balance = balance;
    }
    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
            if(coin.x == this.x){
            if(coin.y > this.y){
                this.y += 1;
            }
            else if(coin.y < this.y){
                this.y -= 1;
            }
        }
            if(coin.x > this.x){
                this.x += 1;
            }
            if (coin.x < this.x) {
                this.x -= 1;
            }
            if(coin.x == this.x && coin.y == this.y){
                balance++;
            }
        if(this.balance > 0){
            System.out.println(this.balance);
        }
    }
}

