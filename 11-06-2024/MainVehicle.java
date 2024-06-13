

import com.vehicles.Car;
import com.vehicles.Truck;

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Truck truck = new Truck("Ford", "F-150", 1.5);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nTruck Details:");
        truck.displayDetails();
    }
}

