package christmas.view;

public enum InputViewType {

    DATE_REQUEST("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"),
    MENU_REQUEST("주문하실 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");

    private final String message;

    InputViewType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}