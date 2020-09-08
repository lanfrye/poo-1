package poo1.models;


import java.util.ArrayList;
import java.util.List;


public class Organization {
	
	private String name;
	private List<User> users;
	private List<Group> groups;
	public Organization(String name) {
		this.name= name;
		groups=new ArrayList<Group>();
		users=new ArrayList<User>();
	
	}
	
	public String getName() {
		return name;
	}
	
	public String setName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "new Organisation = " + name ;
	}
	
}