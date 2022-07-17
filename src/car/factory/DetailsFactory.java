package car.factory;

import car.details.*;

public class DetailsFactory {
    public Country country;

    public DetailsFactory(Country country) {
        this.country = country;
    }

    public Electrics CreateElectrics() {
        return new Electrics(false);
    }

    public Engine CreateEngine() {
        return new Engine(false);
    }

    public GasTank CreateGasTank() {
        return new GasTank(0);
    }

    public Headlights CreateHeadlights() {
        return new Headlights(false);
    }

    public MiniFridge CreateMiniFridge() {
        return new MiniFridge();
    }

    public Socket CreateSocket() {
        return new Socket();
    }

    public Usb CreateUsb() {
        return new Usb();
    }

    public Wheel[] CreateWheels(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }

    public Wheel createSpareWheel(WheelRadius wheelRadius) {
        return new Wheel(false, wheelRadius);
    }

    public Country getCountry() {
        return country;
    }
}
