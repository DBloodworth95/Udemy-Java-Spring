package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.junitwithswing.EngineMain;
import com.dan.spring.myfirstspring.junitwithswing.Shelf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = SpringRunner.class)
@ContextConfiguration(classes = EngineMain.class)
public class EngineTest {

    @Autowired
    private Shelf shelf;

    @Test
    public void getEngineTypeTest() {
        String result = shelf.getEngineType();
        assertEquals("V8", result);
    }
}
