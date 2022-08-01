package car.sales;

import car.factory.AssemblyCar;
import car.model.Car;
import car.storage.Storage;

public class Manager {
    private Storage storage;
    private AssemblyCar assemblyCar;

    public Manager(Storage storage, AssemblyCar assemblyCar) {
        this.storage = storage;
        this.assemblyCar = assemblyCar;
    }

    public Car saleCar(Customer customer) {
        if (customer.getMoney() >= 22_000) {
            return storage.getDyna();

        }
    }
}
