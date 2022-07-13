package car;

import car.details.*;

public abstract class Sedan extends Car {
    private boolean isCruiseControlOn;

    public Sedan(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price, GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels, boolean isCruiseControlOn) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels);
        this.isCruiseControlOn = isCruiseControlOn;
    }

    public void changeCruiseControl() {
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public boolean isCruiseControlOn() {
        return this.isCruiseControlOn;
    }
}
