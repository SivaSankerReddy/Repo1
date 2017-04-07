package com.siva.red.threads;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String city;
	
	public Customer(){}
	
	public Customer(int id, String name, String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString(){
		return "{ ID = " + id + ", Name = " + name + ", City = " + city + " }";
	}

	@Override
	public int compareTo( Customer c2) {
		
		//Customer c1 = (Customer) o1;
		//Customer c2 = (Customer) o2;
		if(this.getId() == c2.getId())
			return 0;
		else if (this.getId() > c2.getId())
			return 1;
		else 
			return -1;
		
	}
	
}
