package webActions;

import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        System.out.println("From App.java");

        // TODO 1 - Uncomment for Checkbox web action activity
        SingleSelectDropDown singleSelectDropDown = new SingleSelectDropDown();
        singleSelectDropDown.main(null);

        // TODO 2 - Uncomment for Edit fields web action activity
        // LearnRadioButton learnRadioButton = new LearnRadioButton();
        // learnRadioButton.main(null);
    }
}