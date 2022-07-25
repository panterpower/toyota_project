package car.model;

import car.details.*;
import car.factory.Country;

public class Camry extends Sedan {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price, Country country,
                 GasTank gastank, Engine engine, Electrics electrics, Headlights headlights,
                 Wheel[] wheels, boolean isCruiseControlOn, Usb usb) {
        super(color, maxSpeed, transmission, isMove, price, country, gastank, engine, electrics, headlights,
                wheels, isCruiseControlOn);
        if (wheels[0].getWheelRadius() != WheelRadius.R17) {
            throw new RuntimeException("Радиус у camry должен быть 17");
        }
        this.usb = usb;
    }


    public Usb getUsb() {
        return usb;
    }
}
