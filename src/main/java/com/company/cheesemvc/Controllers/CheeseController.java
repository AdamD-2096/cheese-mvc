package com.company.cheesemvc.Controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    static HashMap<String, String> cheeses = new HashMap<>();

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheese");

        return "cheese/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String addCheese(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processCheese(@RequestParam String cheese,
                                @RequestParam String info){
        cheeses.put(cheese, info);
        return "redirect:";
    }
}
