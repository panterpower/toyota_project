public abstract class Car {




//    Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16, hiance - 20, dyna - 20).
//    Колеса могуть быть заменяемы если они одинакового диаметра.
//    Бензобак имеет атрибут - количество бензина
//    Двигатель имеет атрибут - работоспособен
//    Электрика имеет атрибут - работоспособна
//    Фары имеют атрибут - работоспособны
//    Цена - с центами


//    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
    private int wheel;
    double gastank;
    boolean engine = true;
    boolean electrics = true;
    boolean headlights = true;
    String type;



    //  конструктор
    public Car(int wheel, double gastank, boolean engine, boolean electrics, boolean headlights) {
        this.wheel = wheel;
        this.gastank = gastank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
    }
    // геттеры
    public int getWheel() {
        return wheel;
    }
    public double getGastank() {
        return gastank;
    }
    public boolean isEngine() {
        return engine;
    }
    public boolean isElectrics() {
        return electrics;
    }
    public boolean isHeadlights() {
        return headlights;
    }


    //



//    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
//    Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16, hiance - 20, dyna - 20).
//    Колеса могуть быть заменяемы если они одинакового диаметра.
//    Бензобак имеет атрибут - количество бензина


}
