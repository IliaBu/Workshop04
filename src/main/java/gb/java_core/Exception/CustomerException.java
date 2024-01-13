package gb.java_core.Exception;

public class CustomerException extends RuntimeException{
    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Покупателя не существует";
    }
}
