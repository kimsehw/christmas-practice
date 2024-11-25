package christmas.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputDateTest {

    @ParameterizedTest
    @ValueSource(strings = {"32", "0", "-1", "a"})
    void 입력_날짜_유효성검사(String input) {
        assertThatThrownBy(() -> new InputDate(input))
                .isInstanceOf(InputException.class).hasMessage(ExceptionType.INVALID_DATE_INPUT_EXCEPTION.getMessage());
    }
}