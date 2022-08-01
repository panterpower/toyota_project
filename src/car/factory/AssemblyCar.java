package car.factory;

import car.details.*;
import car.model.Camry;
import car.model.Dyna;
import car.model.Hiance;
import car.model.Solara;

public class AssemblyCar {

    private static Country country;

    private static DetailsFactory detailsFactory;

    public AssemblyCar(Country country, DetailsFactory detailsFactory) throws CountyFactoryNotEqualException {
        if (country != detailsFactory.getCountry()) {
            throw new CountyFactoryNotEqualException("Ошибка: Страна сборочного конвеера: " + country + " и страна фабрики: " +
                    detailsFactory.getCountry() + " не совпадают");
        }
        this.country = country;
        this.detailsFactory = detailsFactory;
    }

    public Camry createCamry(String color, double price) {
        GasTank gasTank = detailsFactory.CreateGasTank();
        Engine engine = detailsFactory.CreateEngine();
        Electrics electrics = detailsFactory.CreateElectrics();
        Headlights headlights = detailsFactory.CreateHeadlights();

        Wheel[] wheels = detailsFactory.CreateWheels(WheelRadius.R17);
        Usb usb = detailsFactory.CreateUsb();

        return new Camry(color, 250, TransmissionType.ROBOT, false, price, country, gasTank, engine,
                electrics, headlights, wheels, false, usb);
    }

    public Dyna createDyna(String color, double price) {
        GasTank gasTank = detailsFactory.CreateGasTank();
        Engine engine = detailsFactory.CreateEngine();
        Electrics electrics = detailsFactory.CreateElectrics();
        Headlights headlights = detailsFactory.CreateHeadlights();

        Wheel[] wheels = detailsFactory.CreateWheels(WheelRadius.R20);
        Socket socket = new Socket();

        return new Dyna(color, 100, TransmissionType.MECHANIC, false, price, country, gasTank, engine,
                electrics, headlights, wheels, 1000, socket);
    }

    public Hiance createHiance(String color, double price) {
        GasTank gasTank = detailsFactory.CreateGasTank();
        Engine engine = detailsFactory.CreateEngine();
        Electrics electrics = detailsFactory.CreateElectrics();
        Headlights headlights = detailsFactory.CreateHeadlights();

        Wheel[] wheels = detailsFactory.CreateWheels(WheelRadius.R20);
        Wheel safeWheel = detailsFactory.createSpareWheel(WheelRadius.R20);

        return new Hiance(color, 100, TransmissionType.MECHANIC, false, price, country, gasTank, engine,
                electrics, headlights, wheels, 1200, safeWheel);
    }

    public Solara createSolara(String color, double price) {
        GasTank gasTank = detailsFactory.CreateGasTank();
        Engine engine = detailsFactory.CreateEngine();
        Electrics electrics = detailsFactory.CreateElectrics();
        Headlights headlights = detailsFactory.CreateHeadlights();

        Wheel[] wheels = detailsFactory.CreateWheels(WheelRadius.R20);
        MiniFridge miniFridge = detailsFactory.CreateMiniFridge();

        return new Solara(color, 100, TransmissionType.AUTOMATIC, false, price, country, gasTank, engine,
                electrics, headlights, wheels, false, miniFridge);
    }
}
