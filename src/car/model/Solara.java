package car.model;

import car.details.*;
import car.factory.Country;

public class Solara extends Cabriolet{

    private MiniFridge miniFridge;

    public Solara(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  Country country, GasTank gastank, Engine engine, Electrics electrics, Headlights headlights,
                  Wheel[] wheels, boolean roofOn, MiniFridge miniFridge) {
        super(color, maxSpeed, transmission, isMove, price, country, gastank, engine, electrics,
                headlights, wheels, roofOn);
        this.miniFridge = miniFridge;
    }
}
