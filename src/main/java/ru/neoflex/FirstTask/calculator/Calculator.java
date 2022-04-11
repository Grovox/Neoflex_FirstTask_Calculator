package ru.neoflex.FirstTask.calculator;

public class Calculator {
    private String oneNumber, twoNumber,operator;
    private String answer = null;
    public Calculator(String oneNumber, String twoNumber, String operator){
        this.oneNumber = oneNumber;
        this.twoNumber = twoNumber;
        this.operator = operator;
    }

    public Boolean checkingValues(){
        boolean presenceError = false;
        if(oneNumber != null  && twoNumber != null  && operator != null){
            if (oneNumber.matches("[0-9]+(.[0-9]+)?") && twoNumber.matches("[0-9]+(.[0-9]+)?")  &&  operator.matches("sum|sub|mult|div")) {
                presenceError = true;
                System.out.println(22222);
            }
        }
        return presenceError;
    }

    public String sum(){
        answer = Double.toString(Double.parseDouble(oneNumber)+Double.parseDouble(twoNumber));
        return answer;
    }

    public String sub(){
        answer = Double.toString(Double.parseDouble(oneNumber)-Double.parseDouble(twoNumber));
        return answer;
    }

    public String mult(){
        answer = Double.toString(Double.parseDouble(oneNumber)*Double.parseDouble(twoNumber));
        return answer;
    }

    public String div(){
        answer = Double.toString(Double.parseDouble(oneNumber)/Double.parseDouble(twoNumber));
        return answer;
    }

}
