package christmas.model.order;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOrderParser {

    private static final String ORDER_SEPARATOR = ",";
    private static final String ORDER_INFORMATION_SEPARATOR = "-";
    private static final String VALID_INPUT_REGEX = "[^a-zA-Z0-9가-힣ㄱ-ㅎㅏ-ㅣ,-]";
    public static final int NAME_AND_QUANTITY_FORMAT_SIZE = 2;
    public static final int MIN_ORDER = 1;

    public Orders parseOrders(String input) {
        return new Orders(parse(input));
    }


    private List<Order> parse(String input) {
        validateInValidCharacter(input);
        return Arrays.stream(input.split(ORDER_SEPARATOR))
                .map(this::validateOrderFormat)
                .toList();
    }

    private static void validateInValidCharacter(String input) {
        Pattern pattern = Pattern.compile(InputOrderParser.VALID_INPUT_REGEX);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
        }
    }

    private Order validateOrderFormat(String inputOrder) {
        List<String> inputOrderInformation = List.of(inputOrder.split(ORDER_INFORMATION_SEPARATOR));
        validateSize(inputOrderInformation);
        int quantity = getQuantity(inputOrderInformation);
        validateQuantity(quantity);
        String orderName = inputOrderInformation.get(0);
        return new Order(orderName, quantity);
    }

    private static void validateSize(List<String> inputOrderInformation) {
        if (inputOrderInformation.size() != NAME_AND_QUANTITY_FORMAT_SIZE) {
            throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
        }
    }

    private void validateQuantity(int quantity) {
        if (quantity < MIN_ORDER) {
            throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
        }
    }

    private int getQuantity(List<String> inputOrderInformation) {
        try {
            return Integer.parseInt(inputOrderInformation.get(1));
        } catch (NumberFormatException e) {
            throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
        }
    }
}
