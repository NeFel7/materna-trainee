package calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    Map<String, Double> variablesDefined = new HashMap<>();

    String[] getVariables() {
        return variablesDefined.keySet().toArray(new String[0]);
    }

    void setDefinedVariables(Expression e) {
        for (Map.Entry<String, Double> entry : variablesDefined.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            e.setVariable(key, value);
        }
    }

    public double calculate(String term) {
        Expression e = new ExpressionBuilder(term)
                .variables(getVariables())
                .build();

        setDefinedVariables(e);
        return e.evaluate();
    }

    double processCurrentLine(String input) {
        boolean assignment;
        String newVariable;
        String term;

        if (input.contains("=")) {
            assignment = true;
            String[] varInput = input.split("=");
            newVariable = varInput[0].trim();
            term = varInput[1].trim();
        } else {
            assignment = false;
            term = input;
            newVariable = null;
        }
        double result = calculate(term);

        if (assignment){
            variablesDefined.put(newVariable, result);
        }

        return result;
    }

}
