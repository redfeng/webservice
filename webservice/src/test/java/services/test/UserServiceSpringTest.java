package services.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.ws.HelloWorld;
import com.it.ws.UserService;

public class UserServiceSpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cxfClientTest.xml"); // your Spring ApplicationContext
		UserService client = (UserService) context.getBean("userServiceClient");
		client.getUser();
	}

}
