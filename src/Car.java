public abstract class Car {
    private int wheel;
    double gastank;
    boolean engine = true;
    boolean electrics = true;
    boolean headlights = true;

    //  конструктор, сеттер и геттер

    public Car(int wheel, double gastank, boolean engine, boolean electrics, boolean headlights) {
        this.wheel = wheel;
        this.gastank = gastank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
    }


    //



//    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
//    Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16, hiance - 20, dyna - 20).
//    Колеса могуть быть заменяемы если они одинакового диаметра.
//    Бензобак имеет атрибут - количество бензина


}
