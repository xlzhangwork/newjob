package com.xlz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/wow")
public class FirstTest {

    @Autowired
    private GirlProperties girlProperties;

    @Value("${girl.cup}")
    private String cup;

    @RequestMapping(value =  {"/hello","/hi"}, method = RequestMethod.POST)
    public String sayHello(){
        System.out.println("Hello" + "\n");
        System.out.println(girlProperties.getAge() + cup);
        return girlProperties.getCup();
    }
}