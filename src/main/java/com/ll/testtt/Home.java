package com.ll.testtt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "home";
    }

    @GetMapping("/happy")
    @ResponseBody
    public String happy(){
        return "happy";
    }

}
