package car;

import car.Car;
import car.details.*;

public class Camry extends Car {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                 GasTank gastank, Engine engine, Electrics electrics, Headlights headlights,
                 Wheel[] wheels, Usb usb) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels);
        this.usb = usb;
    }

    public Usb getUsb() {
        return usb;
    }
}
