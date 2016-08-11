

public class Lorry extends Car {
    String Trucktype;
    int TruckCapacity;

    public Lorry(String name, int weight, int power, String trucktype, int truckCapacity) {
        super(name, weight, power);
        Trucktype = trucktype;
        TruckCapacity = truckCapacity;
    }

    void setName(String name){
        this.name = new String (name);
    }

    void Trucktype(String Trucktype){
        this.Trucktype = new String (Trucktype);
    }


    void setTruckCapacity(int i){
        TruckCapacity = i;
    }

}