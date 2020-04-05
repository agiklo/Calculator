package com.agiklo.calculator.controler;

import com.agiklo.calculator.model.Calculator;
import com.agiklo.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorControler{

    private CalculatorService calculatorService;

    @Autowired
    public CalculatorControler(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String getCalculatorPage(Calculator calculator, Model model){
        model.addAttribute("calculator", calculator);
        return "calculator";
    }

    @RequestMapping(
            value="/calculator",
            params="clear",
            method = RequestMethod.POST)
    public String clear(@ModelAttribute("calculator") Calculator calculator, Model model ){
        model.addAttribute("calculator",  calculatorService.clear(calculator));
        model.addAttribute("result", 0);
        return "calculator";
    }

    @RequestMapping(
            value="/calculator",
            params="add",
            method = RequestMethod.POST)
    public String add(@ModelAttribute("calculator") Calculator calculator, Model model ){
        model.addAttribute("result", calculatorService.add(calculator));
        return "calculator";
    }

    @RequestMapping(
            value="/calculator",
            params="subtract",
            method = RequestMethod.POST)
    public String subtract(@ModelAttribute("calculator") Calculator calculator , Model model ){
        model.addAttribute("result", calculatorService.subtract(calculator));
        return "calculator";
    }

    @RequestMapping(
            value="/calculator",
            params="multiply",
            method = RequestMethod.POST)
    public String multiply(@ModelAttribute("calculator") Calculator calculator, Model model ){
        model.addAttribute("result", calculatorService.multiply(calculator));
        return "calculator";
    }

    @RequestMapping(
            value="/calculator",
            params="divide",
            method = RequestMethod.POST)
    public String divide(@ModelAttribute("calculator") Calculator calculator, Model model ){
        model.addAttribute("result", calculatorService.divide(calculator));
        return "calculator";
    }
}
