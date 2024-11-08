import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;
import service.ServiceStation;
import service.Serviceable;

public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();


        Bicycle bicycle = new Bicycle("Форвард ", 2);
        Car car = new Car("kia", 4);
        Truck truck = new Truck("Камаз", 8);

        serviceStation.service(bicycle);
        serviceStation.service(car);
        serviceStation.service(truck);
    }
}