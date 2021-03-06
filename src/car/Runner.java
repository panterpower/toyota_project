package car;

import car.details.*;
import car.model.Camry;
import car.model.StartCarException;
import car.storage.Storage;

public class Runner {

    public static void main(String[] args) throws StartCarException {


        GasTank gasTank = new GasTank(50);
        Engine engine = new Engine(false);
        Electrics electrics = new Electrics(false);
        Headlights headLights = new Headlights(false);

        Camry camry = new Camry("black", 100, TransmissionType.ROBOT, true, 100_000.00, gasTank,
                engine, electrics, headLights, createWheelsWithRadius(WheelRadius.R17), true, new Usb());
        camry.start();

//        new Storage(11,22,33,44);

        Storage storage = new Storage();
        System.out.println(storage.getAllCamry());

        

    }

    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}

