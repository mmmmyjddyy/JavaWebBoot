package com.boot.generator;

import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
/**
 * @ClassName Tester
 * @Description 单元测试继承该类即可
 * @Author FLZ
 * @Date 2020/3/18 13:44
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback
public abstract class Tester {
}
