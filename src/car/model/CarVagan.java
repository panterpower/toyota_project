package car.model;

import car.details.*;
import car.factory.Country;

public abstract class CarVagan extends Car {
    private int maxWeight;

    public CarVagan(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                    double price, Country country, GasTank gastank, Engine engine, Electrics electrics,
                    Headlights headlights, Wheel[] wheels, int maxWeight) {
        super(color, maxSpeed, transmission, isMove, price, country, gastank, engine, electrics, headlights, wheels);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
