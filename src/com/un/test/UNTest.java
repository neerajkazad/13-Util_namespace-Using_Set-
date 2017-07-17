package com.un.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.un.beans.Course;

public class UNTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/un/common/application-context.xml"));
		Course course = factory.getBean("course", Course.class);
		System.out.println(course);
	}
}
