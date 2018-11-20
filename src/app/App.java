package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import frame.Biz;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("mybiz.xml");
		//CustBiz °´Ã¼ »ý¼º
		Biz cbiz = (Biz) factory.getBean("cbiz");
		
		cbiz.register();
		cbiz.remove();
		cbiz.modify();
		
		Biz pbiz = (Biz) factory.getBean("pbiz");
		
		pbiz.register();
		pbiz.remove();
		pbiz.modify();
	}

}
