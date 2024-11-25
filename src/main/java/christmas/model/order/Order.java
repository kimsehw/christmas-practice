package christmas.model.order;

import christmas.exception.ExceptionType;
import christmas.exception.InputException;
import christmas.model.menu.Menu;

public class Order {

    private final Menu orderInformation;
    private final String orderName;
    private int quantity;

    public Order(String orderName, int quantity) {
        orderInformation = validateMenuName(orderName);
        this.orderName = orderName;
        this.quantity = quantity;
    }

    private Menu validateMenuName(String orderName) {
        for (Menu menu : Menu.values()) {
            if (menu.isSameWithOrder(orderName)) {
                return menu;
            }
        }
        throw new InputException(ExceptionType.INVALID_ORDER_INPUT_EXCEPTION);
    }

    public Menu getOrderInformation() {
        return orderInformation;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return orderInformation.getTotalPrice(quantity);
    }

    public boolean isBeverage() {
        return orderInformation.isBeverage();
    }
}
