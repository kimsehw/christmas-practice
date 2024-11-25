package christmas.model.order;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;
import christmas.model.menu.Menu;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Orders {

    public static final int MAX_QUANTITY = 20;
    private final List<Order> orders;

    public Orders(List<Order> orders) {
        validate(orders);
        this.orders = orders;
    }

    private void validate(List<Order> orders) {
        validateOrderDuplication(orders);
        validateQuantities(orders);
    }

    private static void validateQuantities(List<Order> orders) {
        List<Integer> quantities = orders.stream().map(Order::getQuantity).toList();
        int remainQuantity = MAX_QUANTITY;
        for (int quantity : quantities) {
            remainQuantity -= quantity;
            if (remainQuantity < 0) {
                throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
            }
        }
    }

    private static void validateOrderDuplication(List<Order> orders) {
        Set<Menu> menusPool = orders.stream()
                .map(Order::getOrderInformation)
                .collect(Collectors.toSet());
        if (menusPool.size() != orders.size()) {
            throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
        }
    }

    public int getTotalAmount() {
        int totalAmount = 0;
        for (Order order : orders) {
            totalAmount += order.getTotalPrice();
        }
        return totalAmount;
    }

    public boolean isAllBeverage() {
        for (Order order : orders) {
            if (!order.isBeverage()) {
                return false;
            }
        }
        return true;
    }
}
