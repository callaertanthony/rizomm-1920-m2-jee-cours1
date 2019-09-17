package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
public class Cours1ApplicationTests {

    @Autowired
    private MyFirstService myFirstService;

    @Autowired
    private MySecondService mySecondService;

    @Test
    public void contextLoads() {
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(0);
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(1);
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(2);
    }

    @Test
    public void monTest() {
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(0);
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(1);
        assertThat(this.myFirstService.myFirstFunction()).isEqualTo(2);
    }

    @Test
    public void monTest2() {
        assertThat(this.mySecondService.mySecondMethod()).isEqualTo(0);
        assertThat(this.mySecondService.mySecondMethod()).isEqualTo(1);
        assertThat(this.mySecondService.mySecondMethod()).isEqualTo(2);
    }
}
