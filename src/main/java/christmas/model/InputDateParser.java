package christmas.model;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;

public class InputDateParser {

    public static final int MIN_DATE = 1;
    public static final int MAX_DATE = 31;


    public Date parse(String input) {
        int date = validateNumberFormat(input);
        validateDateValidRange(date);
        return new Date(date);
    }

    private static void validateDateValidRange(int date) {
        if (isValidDate(date)) {
            throw new InputException(ExceptionType.INVALID_DATE_INPUT_EXCEPTION);
        }
    }

    private static boolean isValidDate(int date) {
        return date < MIN_DATE || date > MAX_DATE;
    }

    private static int validateNumberFormat(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InputException(ExceptionType.INVALID_DATE_INPUT_EXCEPTION);
        }
    }
}
