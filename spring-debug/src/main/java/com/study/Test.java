package com.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring
 *
 * @author shenrongtao
 * @date 2022/3/20
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object a = applicationContext.getBean("a");
		System.out.println(a);
	}

}
