package car;


import car.details.*;
import car.model.Camry;
import car.model.Car;

public class Fabrika {

    GasTank gasTank = new GasTank(0);
    Engine engine = new Engine(false);
    Electrics electrics = new Electrics(false);
    Headlights headLights = new Headlights(false);


    Car car2 = new Car;
    Car car3 = new Car;
    Car car4 = new Car;

//    Camry[] camry = {(Camry) (car1, car2, car3, car4)};
//
//    car1.


    public void createCar() {
        Car car = new Camry("black", 100, TransmissionType.ROBOT, true, 100_000.00, gasTank,
                engine, electrics, headLights, createWheelsWithRadius(WheelRadius.R17), true, new Usb());


    }
        public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }


}
