import car.Car;

public class PassengerCar extends Car {
    int diameter = 0;

    public PassengerCar(int wheel, int diameter, double gastank, boolean engine, boolean electrics, boolean headlights) {
        super(wheel, gastank, engine, electrics, headlights);
        this.diameter = diameter;
    }


}
