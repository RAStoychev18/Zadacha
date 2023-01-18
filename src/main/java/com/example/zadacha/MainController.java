package com.example.zadacha;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/print-numbers")
    public String printNumbers(Model model, @RequestParam int n) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n ; i++) {
            list.add(i);
        }

        model.addAttribute("printNumb1", list);

        return "index";
    }
}