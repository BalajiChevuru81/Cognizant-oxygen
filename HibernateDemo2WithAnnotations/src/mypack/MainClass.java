package mypack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClass {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {		
		System.out.println("Enter person id : ");
		int id=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter person Name : ");
		String name=br.readLine();
		
		System.out.println("Enter person age : ");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Country : ");
		String country=br.readLine();
		
		
		Person p=new Person(id,name,age,country);
		
		
		
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		
		tx.commit();
		session.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
