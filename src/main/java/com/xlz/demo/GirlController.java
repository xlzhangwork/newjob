package com.xlz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdateOne(@PathVariable("id") Integer id,
                              @RequestParam("cupSize") String cupSize,
                              @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void girlDeleteOne(@PathVariable("id") Integer id){
        girlRepository.delete(id);
        System.out.println();
    }

    @GetMapping(value = "/girls/age")
    public List<Girl> findByAge(@RequestParam("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlInsertTwo(){
        girlService.insetTwo();
    }

}
