package Flowers;

import com.sun.prism.paint.Color;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Администратор on 11.08.2016.
 */
public class Main {

    public static void main(String[] args) {


        Bouquet b = new Bouquet();
        b.add(new Rose(1,1,Color.BLACK));
        b.add(new Rose(2,20,Color.RED));
        b.add(new Tulip(6,6,Color.WHITE));

        System.out.println(b.getCost());




    }
}
