package com.xlz.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//类名 + ID类型
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
