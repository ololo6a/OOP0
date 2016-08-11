package Flowers;

import com.sun.prism.paint.Color;

/**
 * Created by Администратор on 11.08.2016.
 */
abstract class Flower {
    int price;
    int size;
    Color color;

    protected Flower(int price, int size, Color color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    int getPrice(){
        return price;
    }
}
