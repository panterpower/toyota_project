package car;

import car.details.*;

<<<<<<< HEAD
public class Camry extends Sedan {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                 GasTank gastank, Engine engine, Electrics electrics, Headlights headlights,
                 Wheel[] wheels, boolean isCruiseControlOn, Usb usb) {
        super(color, maxSpeed, transmission, isMove, price, gastank, engine, electrics, headlights,
                wheels, isCruiseControlOn);
        if (wheels[0].getWheelRadius() != WheelRadius.R17) {
=======
public class Camry extends Car {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                 double price, WheelRadius wheelRadius, GasTank gastank, Engine engine,
                 Electrics electrics, Headlights headlights, Wheel[] wheels, Usb usb) {
        super(color, maxSpeed, transmission, isMove, price, wheelRadius, gastank, engine, electrics, headlights, wheels);
        this.usb = usb;
    }if (wheels[0].getWheelRadius(String white, int maxSpeed, TransmissionType robot, boolean isMove, double price, GasTank gasTank, Engine engine, Electrics electrics, Headlights headLights, Wheel[] wheelsWithRadius, boolean b, Usb usb) != WheelRadius.R17) {
>>>>>>> origin/master
            throw new RuntimeException("Радиус у camry должен быть 17");
        }
        this.usb = usb;
    }


<<<<<<< HEAD
//        this.usb = usb;

=======
>>>>>>> origin/master
    public Usb getUsb() {
        return usb;
    }
}
