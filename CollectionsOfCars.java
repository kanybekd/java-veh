import java.util.*;

public class CollectionsOfCars {
    List<Truck> trucks= new ArrayList<>();
    List<EV> evs= new LinkedList<>();

    public void addNewTruck(Truck newTRcuk ){
        trucks.add(newTRcuk);
        
    }
    public void addNewEV(EV newEV ){
        evs.add(newEV);

    }
    //search vehicle// modelName 
    //print correct vehicle info 
    public void searchVehicle(String model){
        boolean isFound=false;
        for(Truck truck: trucks){
            if(truck.getModel().equalsIgnoreCase(model)){
                System.out.print("Vehicle found: ");
                truck.displayInfo();
                isFound=true;
                
            } //model ""
        }
        for(EV ev: evs){
            if(ev.getModel().equalsIgnoreCase(model)){
                System.out.print("Vehicle found: ");
                ev.displayInfo();
                isFound=true;
                
            }
        }
        if(!isFound){
            System.out.print(model+" Not found: ");
        }
    }

    //disokay all cars
    public void displayAllCars(){
        System.out.println("===TRUCKS===");
        if(trucks.size()==0){
            System.out.println("No Trucks so far");

        }else{

            for(Truck t:trucks){
                t.displayInfo();
            }
        }
        if(evs.size()==0){
            System.out.println("No EVS so far");
        }else{

            System.out.println("===EVs===");
            for(EV e:evs){
                e.displayInfo();
            }
        }
    }


}
