package mypack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	static SessionFactory sf=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure("MyCfg.xml");
		sf=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
