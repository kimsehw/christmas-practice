package christmas.model.order;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;
import christmas.model.menu.Menu;
import christmas.model.menu.MenuCategory;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Orders {

    private static final String LINE_SEPARATOR = System.lineSeparator();
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

    public int howMuchDayDiscount(boolean isWeekend) {
        MenuCategory target = getTargetMenuCategory(isWeekend);
        int totalDiscount = 0;
        for (Order order : orders) {
            if (order.isTarget(target)) {
                totalDiscount += order.getQuantity();
            }
        }
        return totalDiscount * 2023;
    }

    private MenuCategory getTargetMenuCategory(boolean isWeekend) {
        if (isWeekend) {
            return MenuCategory.MAIN;
        }
        return MenuCategory.DESERT;
    }

    public String makeMenuMessage() {
        StringBuilder message = new StringBuilder();
        for (Order order : orders) {
            if (order.isRemain()) {
                message.append(order.toString()).append(LINE_SEPARATOR);
            }
        }
        return message.toString();
    }

    public void champagneEvent() {
        for (Order order : orders) {
            if (order.isChampagne()) {
                order.reduceQuantity();
            }
        }
    }
}

