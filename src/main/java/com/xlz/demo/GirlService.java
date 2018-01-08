package com.xlz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: xlzhang
 * @Description:
 * @Date: Created in 17:06 2018/1/8
 * @Modified By:
 **/
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insetTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("B");
        girlA.setAge(21);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("DD");
        girlB.setAge(18);
        girlRepository.save(girlB);
    }
}
