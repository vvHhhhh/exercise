package com.tigerwow.tea;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Created by wanhu 2019-09-02 18:01
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class BaseTest {

    @BeforeClass
    public static void beforeClass() {
        log.info("测试开始......");
    }

    @AfterClass
    public static void afterClass() {
        log.info("测试结束......");
    }

    @Before
    public void before() {
        log.info("调用测试方法开始......");
    }

    @After
    public void after() {
        log.info("调用测试方法结束......");
    }
}
