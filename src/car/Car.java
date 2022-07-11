package car;

import car.details.*;

public abstract class Car {



//    Для всех машин характерны следующие функции:
//    Начать движение - меняет состояние движения. Начать движение возможно только при: наличии всех колес и они не проколоты, непустом бензобаке,
//    работоспособным электрике и двигателю. Если что то из этого невыполняется, то выкидывается ошибка StartCarException,
//    в сообщении которой содержится причина невозможности движения.
//    Остановить движение - меняет состояние движения. Для остановки не нужно условий.
//    Включить фары - сообщает о работе фар.



    //    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
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
        }

        this.isMove = true;

    }

    public boolean checkWheels() {
        if (wheels == null) {
            return false;
        } else if (wheels.length !=4) {
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
