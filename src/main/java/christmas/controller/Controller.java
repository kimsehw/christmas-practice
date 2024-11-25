package christmas.controller;

import christmas.exception.InputException;
import christmas.model.Date;
import christmas.model.InputDateParser;
import christmas.model.Planner;
import christmas.model.order.InputOrderParser;
import christmas.model.order.Orders;
import christmas.view.InputView;
import christmas.view.InputViewFactory;
import christmas.view.OutputView;
import java.util.function.Supplier;

public class Controller {

    InputView inputView;
    OutputView outputView;
    Planner planner;

    public Controller(InputView inputView, OutputView outputView, Planner planner) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.planner = planner;
    }

    public void run() {
        Date date = handle(this::handleDateInput);
        Orders orders = handle(this::handleOrdersInput);
        outputView.display(planner.calculateAmount(date, orders));
    }

    private <T> T handle(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Date handleDateInput() {
        inputView = InputViewFactory.createDateInputVIew();
        InputDateParser inputDateParser = new InputDateParser();
        return inputDateParser.parse(inputView.getInput());
    }

    private Orders handleOrdersInput() {
        inputView = InputViewFactory.createMenuInputVIew();
        InputOrderParser inputOrderParser = new InputOrderParser();
        return inputOrderParser.parseOrders(inputView.getInput());
    }
}
