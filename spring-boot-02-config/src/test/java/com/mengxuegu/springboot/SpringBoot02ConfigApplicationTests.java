package com.mengxuegu.springboot;

import com.mengxuegu.springboot.bean.Emp;
import com.mengxuegu.springboot.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Emp emp;

    @Autowired
    ApplicationContext context;

    @Test
    void testXml() {
//        EmpService empService = (EmpService) context.getBean("empService");
//        System.out.println(empService);
//        empService.add();
        EmpService empService2 = (EmpService) context.getBean("empService2");
        System.out.println("empService2" + empService2);
        empService2.add();
    }

    @Test
    void contextLoads() {
        System.out.println(emp);
    }

}
