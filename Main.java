import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner newScanner= new Scanner(System.in);
        CollectionsOfCars myGarage= new CollectionsOfCars();
        boolean start=true;
        while(start){
            System.out.println("Wlcome to my Collections Dashboard");
            System.out.println("Please make a selection");
            System.out.println("1.Add new vehicle");
            System.out.println("2.Search a vehicle");
            System.out.println("3.Remove a vehicle");
            System.out.println("4.Display all vehicles");
            System.out.println("5. Exit");
            int selection=newScanner.nextInt();
            newScanner.nextLine();
            switch(selection){
                case 1: 
                    System.out.print("Enter Vehicle Brand: ");
                    String brand=newScanner.nextLine();
                    System.out.print("Enter Vehicle model: ");
                    String model=newScanner.nextLine();
                    System.out.print("Enter Vehicle year: ");
                    int year=newScanner.nextInt();
                    newScanner.nextLine();
                    System.out.print("IS IT EV OR TRUCK ");
                    String vehicleType=newScanner.nextLine();
                    if(vehicleType.equalsIgnoreCase("truck")){
                        System.out.print("Enter Vehicle Load cap: ");
                        double loadCap=newScanner.nextDouble();
                        myGarage.addNewTruck(new Truck(brand,model,year, loadCap));
                    }
                    if(vehicleType.equalsIgnoreCase("ev")){
                        System.out.print("Enter Vehicle battery range: ");
                        double batteryRange=newScanner.nextDouble();
                        myGarage.addNewEV(new EV(brand, model, year, batteryRange));
                    }
                    
                    break;
                case 2:
                    System.out.println("Enter model info:");
                    String modelForSearch=newScanner.nextLine();
                    myGarage.searchVehicle(modelForSearch);
                    break;
                case 3: 
                    System.out.println("Enter model info:");
                    String modelForDelete=newScanner.nextLine();
                    myGarage.removeVehicle(modelForDelete);
                    break;
                case 4:
                    myGarage.displayAllCars();
                    break;
                case 5:
                    System.out.println("Good bye");
                    start=false;
            }
        }

    }
}