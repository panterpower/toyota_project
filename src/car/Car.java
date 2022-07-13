package car;

import car.details.*;

public abstract class Car {

    private String color;
    private int maxSpeed;
    private TransmissionType transmission;
    private boolean isMove;
    private double price;

    private GasTank gasTank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private Wheel[] wheels;

    public Car(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
               double price, GasTank gastank, Engine engine, Electrics electrics, Headlights headlights, Wheel[] wheels) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMove = isMove;
        this.price = price;
        this.gasTank = gastank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.wheels = wheels;
    }

    public Car(int wheel, double gastank, boolean engine, boolean electrics, boolean headlights) {
    }

    public void start() throws StartCarException {
        if (!checkWheels()) {
            throw new StartCarException("Проблема с колесами");
        } else if (gasTank.getCurrentGasVolume() <= 0) {
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

    public void checkCarHealth() {
        String result = "";
        if (!checkWheels()) {
            result += "С колесами проблема ";
        }
        if (gasTank.getCurrentGasVolume() <= 0) {
            result += "Бензобак пустой ";
        }
        if (engine.isBroken()) {
            result += "Двигатель сломан ";
        }
        if (electrics.isBroken()) {
            result += "Электрика сломана ";
        }
        if (headlights.isBroken()) {
            result += "Фары сломаны ";
        }
        if (!result.equals("")) {
            throw new RuntimeException(result);
        }
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
