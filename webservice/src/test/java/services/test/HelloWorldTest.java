package services.test;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.it.ws.HelloWorld;



public class HelloWorldTest {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		factoryBean.getInInterceptors().add(new LoggingInInterceptor());
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:8080/webservice/ws/HelloWorld");
		HelloWorld impl=(HelloWorld) factoryBean.create();
		 impl.sayHi("张三");
	}

}
