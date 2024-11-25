package christmas.model;

public class Date {

    public static final int SATURDAY_MOD = 2;
    public static final int FRIDAY_MOD = 1;
    public static final int WEEKDAY = 7;

    private final int date;

    public Date(int date) {
        this.date = date;
    }

    public boolean isWeekend() {
        return date % WEEKDAY == FRIDAY_MOD || date % 7 == SATURDAY_MOD;
    }
}
