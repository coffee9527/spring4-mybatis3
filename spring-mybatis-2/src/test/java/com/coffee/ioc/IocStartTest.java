package com.coffee.ioc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.examples.ClientService;
import com.coffee.examples.ClientService2;
import com.coffee.examples.ExampleBean;
import com.coffee.ioc.xmlmetadata.PetStoreService;
/**
 * 涉及到的接口和类：接口AccountDao，子类JpaAccountDao.接口ItemDao，接口JpaItemDao。接口PetStoreService，子类PetStoreServiceImpl
 * PetStoreServiceImpl会依赖AccountDao和ItemDao
 * 依赖关系在/spring/ioc/xmlmetadata.xml文件中配置
 * 
 * @author Pancras
 *
 */
public class IocStartTest {
	public static void main(String[] args) {
		//实例化容器
		ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext(new String[]{"/spring/ioc/xmlmetadata.xml"});
		
		
		// retrieve configured instance
		PetStoreService service = classPathXmlApplicationContext.getBean("petStore", PetStoreService.class);

		// use configured instance
		List<String> userList = service.getUsernameList();
		for(String name :userList) {
			System.out.println(name);
		}
		
		//----------------------bean初始化测试--------------------------
		ClientService clientService = classPathXmlApplicationContext.getBean("clientService", ClientService.class);
		ClientService2 clientService2 = classPathXmlApplicationContext.getBean("clientService2", ClientService2.class);
		clientService.sayHello();
		clientService2.sayHello();
		
		//----------------------依赖注入测试--------------------------
		//构造方法注入
		ExampleBean exampleBean = classPathXmlApplicationContext.getBean("exampleBean", ExampleBean.class);
		//Setter方法注入
		ExampleBean exampleBean2 = classPathXmlApplicationContext.getBean("exampleBean2", ExampleBean.class);
		System.out.println(exampleBean.toString());
		System.out.println(exampleBean2.toString());
	}
}
