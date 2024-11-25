package christmas;

import christmas.controller.Controller;
import christmas.model.Planner;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Controller controller = new Controller(new InputView(null), new OutputView(), new Planner());
        controller.run();
    }
}
