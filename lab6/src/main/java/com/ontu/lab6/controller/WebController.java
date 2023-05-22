package com.ontu.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller

public class WebController
{
    char[][] canvas = new char[3][5];

    @RequestMapping(value = "/index")
    public String index(Model model)
    {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if(j == 1 || j == 3) {
                    canvas[i][j] = '|';
                }
                else{
                    if(((int) (Math.random() * 2)) == 0)
                        canvas[i][j] = 'x';
                    else
                        canvas[i][j] = 'o';
                }
            }
        }

        String str = new String(canvas[0]);
        model.addAttribute("variable1", str);
        str = new String(canvas[1]);
        model.addAttribute("variable2", str);
        str = new String(canvas[2]);
        model.addAttribute("variable3", str);
        return "index";
    }
}