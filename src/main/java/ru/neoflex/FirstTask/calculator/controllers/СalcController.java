package ru.neoflex.FirstTask.calculator.controllers;

import ru.neoflex.FirstTask.calculator.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class СalcController {
    @GetMapping("/add")
    public String input(@RequestParam(value = "OneNum", required = false) String oneNumber,
                       @RequestParam(value = "TwoNum", required = false) String twoNumber,
                       @RequestParam(value = "Operator", required = false) String  operator,
                       Model model){
        String answer = "Ответ: ";
        Calculator calc = new Calculator(oneNumber, twoNumber, operator);
        if(calc.checkingValues()) {
            switch (operator) {
                case "sum":
                    answer += calc.sum();
                    break;
                case "sub":
                    answer += calc.sub();
                    break;
                case "mult":
                    answer += calc.mult();
                    break;
                case "div":
                    answer += calc.div();
                    break;
            }
        }else
            answer = "Попробуйте еще : /add?OneNum=число&TwoNum=число&Operator=sum/sub/mult/div";

        model.addAttribute("answer",answer);
        return "answer";
    }
}
