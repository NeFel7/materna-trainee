package calculator;

import net.objecthunter.exp4j.tokenizer.UnknownFunctionOrVariableException;

public class Application {
    private final Calculator model = new Calculator();
    private final GUI view = new GUI();

    void run() {
        while (true) {
            String input = view.getInput();
            if (input.equals("exit")) {
                break;
            }
            if (input.isEmpty()) {
                continue;
            }
            try {
                double result = model.processCurrentLine(input);
                view.outputResult(result);
            } catch (UnknownFunctionOrVariableException e) {
                view.outputErrorMessage(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Application calculator = new Application();
        calculator.run();
    }
}
