package car;

import car.details.*;

<<<<<<< HEAD
public class Dyna extends CarVagan {
=======
public class Dyna extends CarVagan{
>>>>>>> origin/master
    private Socket socket;

    public Dyna(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels,
                int maxWeight, Socket socket) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights, wheels, maxWeight);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}
