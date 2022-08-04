package car.sales;

public class ClientHasNotMoneyException extends Exception{

    public ClientHasNotMoneyException(String message) {
        super(message);
    }
}
