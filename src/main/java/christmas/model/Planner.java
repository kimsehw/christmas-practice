package christmas.model;

import christmas.Receipt;
import christmas.model.order.Orders;

public class Planner {

    public Receipt calculateAmount(Date date, Orders orders) {
        int totalAmount = orders.getTotalAmount();
        boolean canEvent = canEvent(totalAmount, orders.isAllBeverage());
        int dDayDiscount = date.howMuchDiscountDdayEvent();
        int dayDiscount = orders.howMuchDayDiscount(date.isWeekend());
        int specialDiscount = date.specialDiscount();
        boolean canGetEvent = canGetEvent(totalAmount);

        int wholeDiscount = dayDiscount + specialDiscount + dDayDiscount;
        if (canGetEvent) {
            wholeDiscount += 25_000;
        }
        int afterDiscount = totalAmount - wholeDiscount;
        String badge = getBadge(wholeDiscount);
        String ordersMessage = orders.makeMenuMessage();
        return new Receipt(ordersMessage, totalAmount, canEvent, dDayDiscount, dayDiscount, specialDiscount,
                canGetEvent, wholeDiscount, afterDiscount, badge, date.isWeekend());
    }

    private static String getBadge(int wholeDiscount) {
        if (wholeDiscount > 20000) {
            return "산타";
        }
        if (wholeDiscount > 10000) {
            return "트리";
        }
        if (wholeDiscount > 5000) {
            return "별";
        }
        return "없음";
    }

    private boolean canEvent(int totalAmount, boolean isAllBeverage) {
        return (totalAmount >= 10000 && !isAllBeverage);
    }

    private boolean canGetEvent(int totalAmount) {
        return totalAmount > 120_000;
    }
}
