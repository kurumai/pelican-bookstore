package com.circleci.demojavaspring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
@TestPropertySource("/test.properties")
public class BookListViewTests {

	@Test
	public void contextLoads() {
	}

	@Test void test001() throws Throwable{
		Thread.sleep(100);
		assertEquals(true, true);
	}

	@Test void test002() throws Throwable{
		Thread.sleep(100);
		assertEquals(true, true);
	}

	@Test void test003() throws Throwable{
		Thread.sleep(100);
		assertEquals(true, true);
	}

	@Test void test004() throws Throwable{
		Thread.sleep(100);
		assertEquals(true, true);
	}

	@Test void test005() throws Throwable{
		Thread.sleep(100);
		assertEquals(true, false);
	}

}
