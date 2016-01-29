package com.lwd.mvctest.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:mvctest-servlet.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests {
}
