package com.myproject.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void test() {
		logger.info("info:{}", "info");
		logger.error("error:{}","error");
	}

}
