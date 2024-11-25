package christmas.exception;

public enum ExceptionType {

    INVALID_ORDER_INPUT_EXCEPTION("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."),
    INVALID_DATE_INPUT_EXCEPTION("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");

    private final String message;

    ExceptionType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
