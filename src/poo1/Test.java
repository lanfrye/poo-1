package poo1;

import poo1.models.User ;
import poo1.BadPasswordException.BadPasswordEception;
import poo1.models.Group;
import poo1.models.Organization;

public class Test {

	public static void main(String[] args) {
		User u= new User();
		System.out.println(u);
		
		try {
		System.out.println(u);
		u.setPassword("azerty", "azerty");
		System.out.println(u);
		
		}catch (Exception e) {
			if (e instanceof BadPasswordEception) {
			System.out.println("Mauvais mdp");
		} else {
		e.printStackTrace();
		}
		}
		
		Organization o=new Organization("");
		System.out.println(o);
		
	}

	
}
