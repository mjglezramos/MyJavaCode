package org.mjglezramos.data;

import java.util.Date;

/**
 * Information about a Human
 * @author L0009604
 *
 */
public class HumanData extends AnimalData {
	
	private String lastName;
	
	private String email;

	public HumanData(String firstName, Date birthDate, String resume,
			String lastName, String email) {
		super(firstName, birthDate, resume);
		this.lastName = lastName;
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return this.email.hashCode() * this.lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HumanData other = (HumanData) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
}
