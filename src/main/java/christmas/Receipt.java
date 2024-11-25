package christmas;

public class Receipt {

    String ordersMessage;
    int totalAmount;
    boolean canEvent;
    int dDayDiscount;
    int dayDiscount;
    int specialDiscount;
    boolean canGetEvent;
    int wholeDiscount;
    int afterDiscount;
    String badge;
    boolean isWeekend;

    public Receipt(String ordersMessage, int totalAmount, boolean canEvent, int dDayDiscount, int dayDiscount,
                   int specialDiscount, boolean canGetEvent, int wholeDiscount, int afterDiscount, String badge,
                   boolean isWeekend) {
        this.ordersMessage = ordersMessage;
        this.totalAmount = totalAmount;
        this.canEvent = canEvent;
        this.dDayDiscount = dDayDiscount;
        this.dayDiscount = dayDiscount;
        this.specialDiscount = specialDiscount;
        this.canGetEvent = canGetEvent;
        this.wholeDiscount = wholeDiscount;
        this.afterDiscount = afterDiscount;
        this.badge = badge;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getOrdersMessage() {
        return ordersMessage;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public boolean isCanEvent() {
        return canEvent;
    }

    public int getdDayDiscount() {
        return dDayDiscount;
    }

    public int getDayDiscount() {
        return dayDiscount;
    }

    public int getSpecialDiscount() {
        return specialDiscount;
    }

    public boolean isCanGetEvent() {
        return canGetEvent;
    }

    public int getWholeDiscount() {
        return wholeDiscount;
    }

    public int getAfterDiscount() {
        return afterDiscount;
    }

    public String getBadge() {
        return badge;
    }
}
