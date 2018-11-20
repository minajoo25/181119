package tv2app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import tv2.tv;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("mytv.xml");
		
		tv stv = (tv) factory.getBean("sstv");
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
		
	}

}
