package car.storage;

import car.factory.AssemblyCar;
import car.model.*;

public class Storage {

    private int freeSpace = 1_000;
    private int countCamry = 0;
    private int countSolara = 0;
    private int countDyna = 0;
    private int countHiance = 0;
    Camry[] allCamry = new Camry[1000];
    Solara[] allSolara = new Solara[1000];
    Dyna[] allDyna = new Dyna[1000];
    Hiance[] allHiance = new Hiance[1000];

    public Car[] getAllCamry() {
        return allCamry;
    }

    public Storage() {

    }
    public void addCamry(Camry camry) {
        if(freeSpace > 0){
            allCamry[countCamry] = camry;
            freeSpace--;
            countCamry++;
        }
    }

    public Camry getCamry() {
        Camry camry = allCamry[countCamry - 1];
        allCamry[countCamry - 1] = null;
        countCamry--;
        return camry;
    }

}
