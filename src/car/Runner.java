package car;

import car.details.Wheel;
import car.details.WheelRadius;

public class Runner {

    public static void main(String[] args) {
        new 

    }

    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}

