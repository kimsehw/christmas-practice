package christmas.model.menu;

public enum Menu {
    MUSHROOM_SOUP("양송이수프", 6_000, MenuCategory.APPETIZER),
    TAPAS("타파스", 5_500, MenuCategory.APPETIZER),
    CAESAR_SALAD("시저샐러드", 8_000, MenuCategory.APPETIZER),

    T_STEAK("티본스테이크", 55_000, MenuCategory.MAIN),
    RIB_BBQ("바비큐립", 54_000, MenuCategory.MAIN),
    SEA_FOOD_PASTA("해산물파스타", 35_000, MenuCategory.MAIN),
    CHRISTMAS_PASTA("크리스마스파스타", 25_000, MenuCategory.MAIN),

    CHOCO_CAKE("초코케이크", 15_000, MenuCategory.DESERT),
    ICE_CREAM("아이스크림", 5_000, MenuCategory.DESERT),

    ZERO_COKE("제로콜라", 3_000, MenuCategory.BEVERAGE),
    RED_WHINE("레드와인", 60_000, MenuCategory.BEVERAGE),
    CHAMPAGNE("샴페인", 25_000, MenuCategory.BEVERAGE);

    private final String name;
    private final int price;
    private final MenuCategory menuCategory;

    Menu(String name, int price, MenuCategory menuCategory) {
        this.name = name;
        this.price = price;
        this.menuCategory = menuCategory;
    }

    public boolean isSameWithOrder(String orderName) {
        return orderName.equals(name);
    }

    public int getTotalPrice(int quantity) {
        return price * quantity;
    }

    public boolean isBeverage() {
        return menuCategory == MenuCategory.BEVERAGE;
    }
}
