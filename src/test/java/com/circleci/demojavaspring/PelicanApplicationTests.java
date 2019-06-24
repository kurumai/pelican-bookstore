package com.circleci.demojavaspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.pelican.PelicanApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = PelicanApplication.class)
@TestPropertySource("/test.properties")
public class PelicanApplicationTests {

	@Test
	public void contextLoads() {
	}

}
