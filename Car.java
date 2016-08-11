/**
 * Created by Администратор on 07.08.2016.
 */
public class Car {

    String name;
    int weight;
    int power;

    public Car(String name, int weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

