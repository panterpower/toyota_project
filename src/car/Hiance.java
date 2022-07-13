package car;

import car.details.*;

<<<<<<< HEAD
public class Hiance extends CarVagan {
=======
public class Hiance extends CarVagan{
>>>>>>> origin/master
    private Wheel safeWheel;

    public Hiance(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels,
                  int maxWeight, Wheel safeWheel) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels, maxWeight);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }
}
