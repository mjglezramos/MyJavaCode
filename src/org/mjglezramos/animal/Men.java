package org.mjglezramos.animal;

import java.util.Date;

public class Men extends Human {

	public static final String GENDER = "men";
	
	public Men(String firstName, Date birthDate, String resume,
			String lastName, String email) {
		super(firstName, birthDate, resume, lastName, email);	
	}
}
