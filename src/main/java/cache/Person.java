package cache;

import java.io.Serializable;

public class Person implements Serializable{
	
	String name;
	String surname;
	String username;
	int age;

	public Person(final String name, final String surname, final String username, final int age) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
