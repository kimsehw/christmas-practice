package christmas.exception;

public class InputException extends IllegalArgumentException {

    public InputException(ExceptionType exceptionType) {
        super(exceptionType.getMessage());
    }
}
