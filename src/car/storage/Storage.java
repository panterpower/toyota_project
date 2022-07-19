package car.storage;

import car.model.*;

public class Storage {
    private int allCars = 0;

    private int countCamry;
    private int countSolara;
    private int countDyna;
    private int countHiance;

    public Storage(int countCamry, int countSolara, int countDyna, int countHiance) {
        this.countCamry = countCamry;
        this.countSolara = countSolara;
        this.countDyna = countDyna;
        this.countHiance = countHiance;
    }

    private Car[] camry = new Camry[countCamry];
    private Car[] solara = new Solara[countSolara];
    private Car[] dyna = new Dyna[countDyna];
    private Car[] hiance = new Hiance[countHiance];


}
