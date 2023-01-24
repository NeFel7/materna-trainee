package calculator;

import java.util.Scanner;


public class GUI {

    Scanner scanner = new Scanner(System.in);

    String getInput() {
        System.out.println("> ");
        return scanner.nextLine().trim();
    }

    void  outputResult(double result) {
        double precision = 0.0001;

        int roundedResult = (int) Math.round(result);
        if(Math.abs(result - roundedResult) < precision){
            System.out.println(roundedResult);
        } else {
            System.out.println(result);
        }
    }

    public void outputErrorMessage(String message) {
        System.out.println(message);
    }
}
