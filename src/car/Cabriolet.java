package car;

import car.details.*;

public abstract class Cabriolet extends Car {
    private boolean isRoofOn;

    public Cabriolet(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                     GasTank gastank, Engine engine, Electrics electrics,
                     Headlights headlights, Wheel[] wheels, boolean roofOn) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels);
        isRoofOn = roofOn;
    }

    public void changeRoof() {
        this.isRoofOn = !this.isRoofOn;
    }

    public boolean isRoofOn() {
        return this.isRoofOn;
    }
}
