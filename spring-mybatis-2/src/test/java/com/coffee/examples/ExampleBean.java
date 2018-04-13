package com.coffee.examples;

public class ExampleBean {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int integerProperty;
	
	//必须要有默认的无参构造
	public ExampleBean() {

	}

	public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int integerProperty) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.integerProperty = integerProperty;
	}
	
	
	
	public AnotherBean getBeanOne() {
		return beanOne;
	}



	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}



	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}



	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}



	public int getIntegerProperty() {
		return integerProperty;
	}



	public void setIntegerProperty(int integerProperty) {
		this.integerProperty = integerProperty;
	}



	@Override
	public String toString() {
		return "ExampleBean [beanOne=" + beanOne + ", beanTwo=" + beanTwo + ", integerProperty=" + integerProperty
				+ "]";
	}
}
