package car;

import car.factory.AssemblyCar;
import car.factory.Country;
import car.factory.CountyFactoryNotEqualException;
import car.factory.DetailsFactory;
import car.model.*;
import car.sales.Casher;
import car.sales.ClientHasNotMoneyException;
import car.sales.Customer;
import car.sales.Manager;
import car.storage.Storage;

public class Task4 {
    public static void main(String[] args) {

        try {
            DetailsFactory detailsFactory = new DetailsFactory(Country.JAPAN);
            AssemblyCar assemblyCar = new AssemblyCar(Country.JAPAN, detailsFactory);
            Storage storage = new Storage();
            Camry camry = assemblyCar.createCamry("black", 10_000);
            Solara solara = assemblyCar.createSolara("white", 12_000);
            Hiance hiance = assemblyCar.createHiance("black", 15_000);
            Dyna dyna = assemblyCar.createDyna("black", 22_000);

            storage.addCar(camry);
            storage.addCar(solara);
            storage.addCar(hiance);
            storage.addCar(dyna);

            Manager manager = new Manager(storage, assemblyCar);
            Casher casher = new Casher();

            Customer[] customers = {new Customer(10000, "Sergey"),
                    new Customer(12000, "Sergey"),
                    new Customer(15000, "Sergey"),
                    new Customer(22000, "Sergey"),
                    new Customer(11000, "Sergey"),
                    new Customer(13000, "Sergey"),
                    new Customer(8000, "Sergey"),
                    new Customer(30000, "Sergey")};

            for (Customer customer : customers) {
                try {
                    Car car = manager.saleCar(customer);
                    casher.makeOrder(car);

                } catch (ClientHasNotMoneyException e) {
                }
            }
            Casher.getTotalIncomes();


        } catch (CountyFactoryNotEqualException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

//        У нас уже есть машины, которые могут храниться на складах!
//                Теперь нам необходимо создать дилерскую сеть, которая будет продавать машины!
//                Для этого нам потребуется:
//        Создать склад, производство и сборку в Японии.
//        1. Создать 4 модели машины: camry 10000 black, solara 12000 white, hiance 15000 black, dyna 22000 black.
//        2. Занести их в склад.
//        2. Создать покупателя, у которого мы задаем сумму денег, на которую он может купить машину, а так же его имя
//        3. Создать Менеджера: он ожидает нового покупателя, и за его сумму предлагает купить машину.
//        У менеджера есть метод - продать машину клиенту: возвращается самая дорогая машина,
//        которую может купить покупатель со своей суммой денег из имеющихся. Если машин на складе нет, то
//        идет запрос на сборку и производство по ценам выше, и машина заносится на склад.
//        Если клиенту не хватает денег, то никакую машину он не получает.
//        4. Создать кассира: кассир принимает заказ - берет машину, и заносит в общий для всех кассиров счет доходов.
//
//        В первый день придет 8 покупателей.

//
//        Процесс продажи:
//        Создается менеджер
//        Создается покупатель №1
//        Менеджер принимает покупателя №1 и возвращает машину
//        Кассир принимает машину для продажи и заносит в счет проданную машину
//        ...
//        Создается покупатель №2 и начинается снова продажа машин
//        В конце выводится сумма проданных машин
    }
}
