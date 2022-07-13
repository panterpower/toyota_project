package car;

import car.details.*;

public abstract class Cabriolet extends Car {
    private boolean isRoofOn;

    public Cabriolet(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
<<<<<<< HEAD
                     GasTank gastank, Engine engine, Electrics electrics,
                     Headlights headlights, Wheel[] wheels, boolean isRoofOn) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels);
=======
                     WheelRadius wheelRadius, GasTank gastank, Engine engine, Electrics electrics,
                     Headlights headlights, Wheel[] wheels, boolean isRoofOn) {
        super(color, maxSpeed, transmission, isMove, price, wheelRadius, gastank, engine, electrics, headlights, wheels);
>>>>>>> origin/master
        this.isRoofOn = isRoofOn;
    }

    public void changeRoof() {
        this.isRoofOn = !this.isRoofOn;
    }

    public boolean isRoofOn() {
        return this.isRoofOn;
    }
}
