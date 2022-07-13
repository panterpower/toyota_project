package car;

import car.details.*;

public class Solara extends Cabriolet{

    private MiniFridge miniFridge;

    public Solara(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels,
                  boolean roofOn, MiniFridge miniFridge) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels, roofOn);
        this.miniFridge = miniFridge;
    }
}
