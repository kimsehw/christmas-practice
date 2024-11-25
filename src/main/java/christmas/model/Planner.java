package christmas.model;

import christmas.model.order.Orders;

public class Planner {

    public void calculateAmount(Date date, Orders orders) {
        int totalAmount = orders.getTotalAmount();
        boolean canEvent = canEvent(totalAmount, orders.isAllBeverage());

        if (date.isWeekend()) {

        }
    }

    private boolean canEvent(int totalAmount, boolean isAllBeverage) {
        return (totalAmount >= 10000 || !isAllBeverage);
    }
}
