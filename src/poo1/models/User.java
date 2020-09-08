package poo1.models;

import poo1.BadPasswordException.BadPasswordEception;

public class User extends Object{
	private String login;
	private String password;
	private Group group;
	private Organization organization;
	
	public User(String password, String login, Group group) {
		this.password= password;
		this.login=login;
		this.group=group;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public String getLogin () {
		return this.login;
		}
	public void setLogin(String login ) {
		this.login=login;
		
	}
	
	public void setPassword(String password, String conf) throws Exception{
		if(password.equals(this.password)||!password.equals(conf)) {
		throw new BadPasswordEception("");
		}
		this.password=password;
		
	}
	
	@Override
	
	public String toString () {
		if(group!=null) {
			return login+"("+group+")";
	}
	return login;
	}

	public void GetGroup(Group g) {
		// TODO Auto-generated method stub
		
	}


	public void SetGroup(Group g) {
		// TODO Auto-generated method stub
		
	}
	
	
}
