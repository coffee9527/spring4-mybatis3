package com.coffee.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		for(int i=0;i<4;i++) {
			System.out.println("==========");
		}
		System.out.println("Bean '" + beanName + "' created-before : " + bean.toString());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		for(int i=0;i<4;i++) {
			System.out.println("==========");
		}
		System.out.println("Bean '" + beanName + "' created-after : " + bean.toString());
        return bean;
	}

}
