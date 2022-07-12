package car;

import car.details.*;

public class Runner {

    public static void main(String[] args) throws StartCarException{

        GasTank gasTank = new GasTank(0);
        Engine engine = new Engine(true);
        Electrics electrics = new Electrics(true);
        Headlights headLights = new Headlights(true);

        Camry camry = new Camry("white", 180, TransmissionType.ROBOT, true,
                100_000.00, gasTank, engine, electrics, headLights,
                createWheelsWithRadius(WheelRadius.R17), false, new Usb());

        camry.start();


    }

    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}

