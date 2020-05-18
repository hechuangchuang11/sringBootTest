package com.hcc.gmalluser;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GmallUserApplication.class})
public class TestMode {

    @Test
    public void getUserQuery(){
        System.out.println("测试方法");
    }

    @Before
    public void testBefore(){
        System.out.println("执行测试方法前");
    }
    @After
    public void testAfter(){
        System.out.println("执行测试方法后");
    }

}
