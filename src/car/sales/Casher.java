package car.sales;

import car.model.Car;

public class Casher {

    private static double TOTAL_INCOMES = 0;

    public void makeOrder(Car car) {
        TOTAL_INCOMES += car.getPrice();
    }

    public static void getTotalIncomes() {
        System.out.println("Доход от всех машины равны: " + TOTAL_INCOMES);
    }
}
