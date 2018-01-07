package com.xlz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/wow")
public class FirstTest {

    @Autowired
    private GirlProperties girlProperties;

    @Value("${girl.cup}")
    private String cup;

    @GetMapping(value =  {"/hello","/hi"})
    public String sayHello(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        System.out.println("Hello" + "\n");
        System.out.println(girlProperties.getAge() + cup);
        return "id: " + id;
        //return girlProperties.getCup();
    }
}