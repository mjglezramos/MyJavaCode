package org.mjglezramos.animal;

import java.util.Date;

public class Woman extends Human {

	public static final String GENDER = "woman";
	
	public Woman(String firstName, Date birthDate, String resume,
			String lastName, String email) {
		super(firstName, birthDate, resume, lastName, email);
	}

}
