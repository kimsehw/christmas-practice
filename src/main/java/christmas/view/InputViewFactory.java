package christmas.view;

public class InputViewFactory {

    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String WELCOME_MESSAGE = "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.";

    private InputViewFactory() {
    }

    public static InputView createDateInputVIew() {
        return new InputView(WELCOME_MESSAGE + LINE_SEPARATOR + InputViewType.DATE_REQUEST.getMessage());
    }

    public static InputView createMenuInputVIew() {
        return new InputView(InputViewType.MENU_REQUEST.getMessage());
    }
}
