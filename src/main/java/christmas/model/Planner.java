package christmas.model;

import christmas.model.order.Orders;

public class Planner {

    public void calculateAmount(Date date, Orders orders) {
        int totalAmount = orders.getTotalAmount();
        boolean canEvent = canEvent(totalAmount, orders.isAllBeverage());
        int dDayDiscount = date.howMuchDiscountDdayEvent();
        int dayDiscount = orders.howMuchDayDiscount(date.isWeekend());
        int specialDiscount = date.specialDiscount();
        boolean canGetEvent = canGetEvent(totalAmount);
    }

    private boolean canEvent(int totalAmount, boolean isAllBeverage) {
        return (totalAmount >= 10000 || !isAllBeverage);
    }

    private boolean canGetEvent(int totalAmount) {
        return totalAmount > 120_000;
    }
}
