package car;

import car.details.*;
import car.model.Camry;
import car.model.Car;

public class Factory extends Car {
    // менеджер
    private String color = "black";
    private double price = 10_000.00;
    private Country country;

// Стандартные данные
    private static GasTank gasTank = new GasTank(0);
    private static Engine engine = new Engine(true);
    private static Electrics electrics = new Electrics(true);
    private static Headlights headLights = new Headlights(true);

//    Camry camry = new Camry(color, 100, TransmissionType.ROBOT, false, price, gasTank,
//            engine, electrics, headLights, createWheelsWithRadius(WheelRadius.R17), true, new Usb());

    public Factory(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                   GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels,
                   String color1, double price1, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels);
        this.color = color1;
        this.price = price1;
        this.country = country;
    }

    public String getColor() {
        return color;
        return price;
        return country;
    }


    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }

}
