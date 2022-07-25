package car.model;

import car.details.*;
import car.factory.Country;

public class Dyna extends CarVagan {

    private Socket socket;

    public Dyna(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price, Country country,
                GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels,
                int maxWeight, Socket socket) {
        super(color, maxSpeed, transmission, isMove, price, country, gastank, engine, electrics, headlights,
                wheels, maxWeight);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}
