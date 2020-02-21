package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PersonDetails")
public class Person {
	
	@Id @GeneratedValue
	@Column(name="p_id")
	private int personId;
	
	@Column(name="pname")
	private String personName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="coun")
	private String country;
	
	public Person() {}
	
	
	
	public Person(int personId, String personName, int age, String country) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
		this.country = country;
	}



	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
