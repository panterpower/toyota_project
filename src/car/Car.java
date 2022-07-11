package car;

import car.details.*;

public abstract class Car {

    private String color;
    private int maxSpeed;
    private TransmissionType transmission;
    private boolean isMove;
    private double price;

    private GasTank gastank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private Wheel[] wheels;

    public Car(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price, GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMove = isMove;
        this.price = price;
        this.gastank = gastank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.wheels = wheels;
    }

    public void start() throws StartCarException {
        if (!checkWheels()) {
            throw new StartCarException("Проблема с колесами");
        } else if (gastank.getCurrentGasVolume() <= 0) {
            throw new StartCarException("Пустой бензобак");
        } else if (electrics.isBroken()) {
            throw new StartCarException("Проблема с электрикой");
        } else if (engine.isBroken()) {
            throw new StartCarException("Проблема с двигателем");
        } else if (headlights.isBroken()) {
            throw new StartCarException("Проблема с фарами");
        }

        this.isMove = true;

    }

    public void onHeadlights() {
        if (!headlights.isBroken()) {
            System.out.println("Включаем фары");
        }
    }

    public void stop() {
        this.isMove = false;
    }


    public boolean checkWheels() {
        if (wheels == null) {
            return false;
        } else if (wheels.length != 4) {
            return false;
        }

        for (Wheel wheel : wheels) {
            if (wheel.isBroken()) {
                return false;
            }
        }
        return true;
    }
}
