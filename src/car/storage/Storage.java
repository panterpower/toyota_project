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

    public void addDyna(Dyna dyna) {
        if(freeSpace > 0){
            allDyna[countDyna] = dyna;
            freeSpace--;
            countDyna++;
        }
    }
    public Dyna getDyna() {
        Dyna dyna = allDyna[countDyna - 1];
        allDyna[countDyna - 1] = null;
        countDyna--;
        return dyna;
    }

    public void addHiance(Hiance hiance) {
        if(freeSpace > 0){
            allHiance[countHiance] = hiance;
            freeSpace--;
            countHiance++;
        }
    }
    public Hiance getHiance() {
        Hiance hiance = allHiance[countHiance - 1];
        allHiance[countHiance - 1] = null;
        countHiance--;
        return hiance;
    }

    public void addSolara(Solara solara) {
        if(freeSpace > 0){
            allSolara[countSolara] = solara;
            freeSpace--;
            countSolara++;
        }
    }
    public Solara getSolara() {
        Solara solara = allSolara[countSolara - 1];
        allSolara[countSolara - 1] = null;
        countSolara--;
        return solara;
    }
}
