package Flowers;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 11.08.2016.
 */
public class Bouquet {
    private LinkedList<Flower> bouquet;

    Bouquet(){
        bouquet = new LinkedList<Flower>();
    }

    void add(Flower f){
        bouquet.add(f);
    }

    int getCost(){
        int cost = 0;

        for (Flower i:bouquet){
            cost+=i.getPrice();
        }

        return cost;
    }
}
