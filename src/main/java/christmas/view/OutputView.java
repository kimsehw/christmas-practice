package christmas.view;

import christmas.Receipt;

public class OutputView {

    public void display(Receipt receipt) {
        System.out.println("12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
        System.out.println("<주문 메뉴>");
        System.out.println(receipt.getOrdersMessage());
        System.out.println("<할인 전 총주문 금액>");
        if (receipt.isCanEvent()) {
            System.out.println(String.format("%,d원", receipt.getTotalAmount()));
            System.out.println();
            System.out.println("<증정 메뉴>");
            if (receipt.isCanGetEvent()) {
                System.out.println("샴페인 1개");
            }
            if (!receipt.isCanGetEvent()) {
                System.out.println("없음");
            }
            System.out.println();
            System.out.println("<혜택 내역>");
            if (receipt.getdDayDiscount() > 0) {
                System.out.println(String.format("크리스마스 디데이 할인 -%,d", receipt.getdDayDiscount()));
            }
            if (receipt.getSpecialDiscount() > 0) {
                System.out.println(String.format("특별 할인 -%,d", receipt.getSpecialDiscount()));
            }
            if (receipt.getDayDiscount() > 0) {
                if (receipt.isWeekend()) {
                    System.out.println(String.format("주말 할인 -%,d", receipt.getDayDiscount()));
                }
                if (!receipt.isWeekend()) {
                    System.out.println(String.format("평일 할인 -%,d", receipt.getDayDiscount()));
                }
            }
            if (receipt.isCanGetEvent()) {
                System.out.println("증정 이벤트: -25,000원");
            }
            System.out.println();
            System.out.println("<총혜택 금액>");
            System.out.println(String.format("-%,d원", receipt.getWholeDiscount()));
            System.out.println();
            System.out.println("<할인 후 예상 결제 금액>");
            System.out.println(String.format("%,d", receipt.getAfterDiscount()));
            System.out.println();
            System.out.println("<12월 이벤트 배지>");
            System.out.println(receipt.getBadge());
        }
        if (!receipt.isCanEvent()) {
            System.out.println(String.format("%,d원", receipt.getTotalAmount()));
            System.out.println();
            System.out.println("<증정 메뉴>");
            System.out.println("없음");
            System.out.println();
            System.out.println("<혜택 내역>");
            System.out.println("없음");
            System.out.println();
            System.out.println("<총혜택 금액>");
            System.out.println("0원");
            System.out.println();
            System.out.println("<할인 후 예상 결제 금액>");
            System.out.println(String.format("%,d원", receipt.getTotalAmount()));
            System.out.println();
            System.out.println("<12월 이벤트 배지>");
            System.out.println(receipt.getBadge());
        }
    }
}
