package car.model;

import car.details.*;
import car.factory.Country;

public abstract class Cabriolet extends Car {
    private boolean isRoofOn;

    public Cabriolet(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                     Country country, GasTank gastank, Engine engine, Electrics electrics,
                     Headlights headlights, Wheel[] wheels, boolean isRoofOn) {
        super(color, maxSpeed, transmission, isMove, price, country, gastank, engine, electrics, headlights, wheels);

        this.isRoofOn = isRoofOn;
    }

    public void changeRoof() {
        this.isRoofOn = !this.isRoofOn;
    }

    public boolean isRoofOn() {
        return this.isRoofOn;
    }
}
