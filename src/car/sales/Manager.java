package car.sales;

import car.factory.AssemblyCar;
import car.model.*;
import car.storage.Storage;

public class Manager {
    private Storage storage;
    private AssemblyCar assemblyCar;

    public Manager(Storage storage, AssemblyCar assemblyCar) {
        this.storage = storage;
        this.assemblyCar = assemblyCar;
    }

    public Car saleCar(Customer customer) throws ClientHasNotMoneyException {
        if (customer.getMoney() >= 22_000d) {
            try {
                return storage.getDyna(Dyna.class);
            } catch (RuntimeException e) {
                Dyna dyna = assemblyCar.createDyna("black", 22_000);
                storage.addCar(dyna);
                storage.getDyna(Dyna.class);
            }
        } else if (customer.getMoney() >= 15_000d) {
            try {
                return storage.getHiance(Hiance.class);
            } catch (RuntimeException e) {
                Hiance hiance = assemblyCar.createHiance("black", 15_000);
                storage.addCar(hiance);
                storage.getHiance(Hiance.class);
            }
        } else if (customer.getMoney() >= 12_000d) {
            try {
                return storage.getSolara(Solara.class);
            } catch (RuntimeException e) {
                Solara solara = assemblyCar.createSolara("white", 12_000);
                storage.addCar(solara);
                storage.getSolara(Solara.class);
            }
        } else if (customer.getMoney() >= 10_000d) {
            try {
                return storage.getCamry(Camry.class);
            } catch (RuntimeException e) {
                Camry camry = assemblyCar.createCamry("black", 10_000);
                storage.addCar(camry);
                storage.getCamry(Camry.class);
            }
        }
        throw new ClientHasNotMoneyException("Клиент без денег");
    }
}
