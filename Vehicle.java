public class Vehicle {
    private String brand;
    private String model;
    protected int year;
    public Vehicle(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    //getters
    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void displayInfo(){
        System.out.println("Brand " + brand
            +" " +year + " "+ model
        );
    }

}

class Truck extends Vehicle{
    private double loadCapacity;
    public Truck(String brand, String model, int year, double l){
        super(brand, model, year);
        loadCapacity=l;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand " + getBrand()
            +" " +year + " "+ getModel()+" "+ loadCapacity
        );
    }
}
class EV extends Vehicle{
    private double batteryRange;
    public EV(String brand, String model, int year, double br){
        super(brand, model, year);
        batteryRange=br;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand " + getBrand()
            +" " +year + " "+ getModel()+" "+ batteryRange
        );
    }
}