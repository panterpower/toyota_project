import car.Car;

public class Runner {
    public static void main(String[] args) {

        Car car = new CargoCar(4, 50, true, true, true);
        System.out.println(car.getGastank());
        System.out.println(car.getWheel());

//        4. Необходимо создать класс Runner и в нем создать все модели, и проверить работоспособность всех методов.

//        car.Car camry = new PassengerCar();
//        car.Car solara = new PassengerCar();
//        car.Car hiance = new PassengerCar();
//        car.Car dyna = new PassengerCar();
//
//        camry.getGastank();
//        solara.getGastank();
//        hiance.getGastank();
//        dyna.getGastank();
//

    }
}
