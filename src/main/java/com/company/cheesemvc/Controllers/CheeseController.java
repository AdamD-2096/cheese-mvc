package com.company.cheesemvc.Controllers;

import com.company.cheesemvc.Helpers.Valid;
import com.company.cheesemvc.Models.Cheese;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    static HashMap<String, Cheese> cheeses = new HashMap<>();

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheese");

        return "cheese/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String addCheese(Model model, HttpServletRequest request){
        String oops = request.getParameter("oops");
        if (oops == null){
        }
        else if (oops.equals("12")){
            oops = "you must have content in cheese";
            String oops2 = "you can only you alphabetical characters, spaces, and these symbols . , ! ";
            model.addAttribute("oops",oops);
            model.addAttribute("oops2",oops2);
        }
        model.addAttribute("title","Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processCheese(@RequestParam String cheese,
                                @RequestParam String info){
        if (Valid.validCheese(cheese) && Valid.validDescription(info)){
            Cheese cheeze = new Cheese(cheese, info);
            cheeses.put(cheese, cheeze);
        }else{
            return "redirect:/cheese/add?oops=12";
        }

        return "redirect:";
    }

    @RequestMapping(value="remove", method = RequestMethod.GET)
    public String removeCheese(Model model){
        model.addAttribute("title","Remove Cheese");
        model.addAttribute("cheeses", cheeses);
        return "cheese/remove";
    }

    @RequestMapping(value="remove", method = RequestMethod.POST)
    public String processRemove(@RequestParam ArrayList<String> cheesez){
        for (String cheese : cheesez) {
            cheeses.remove(cheese);
        }
        return "redirect:";
    }
}
