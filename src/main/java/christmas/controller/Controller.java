package christmas.controller;

import christmas.model.Date;
import christmas.model.InputDateParser;
import christmas.model.Planner;
import christmas.model.order.InputOrderParser;
import christmas.model.order.Orders;
import christmas.view.InputView;
import christmas.view.InputViewFactory;
import christmas.view.OutputView;

public class Controller {

    public void run() {
        InputView inputView = InputViewFactory.createDateInputVIew();
        InputDateParser inputDateParser = new InputDateParser();
        Date date = inputDateParser.parse(inputView.getInput());
        inputView = InputViewFactory.createMenuInputVIew();
        Orders orders = new InputOrderParser().parseOrders(inputView.getInput());
        Planner planner = new Planner();
        OutputView outputView = new OutputView();
        outputView.display(planner.calculateAmount(date, orders));
    }
}
