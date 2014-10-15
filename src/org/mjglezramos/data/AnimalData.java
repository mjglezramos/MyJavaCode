package org.mjglezramos.data;

import java.util.Date;

/**
 * Class for mantain the basic information
 * about an animal
 * @author L0009604
 *
 */
public class AnimalData {
	
	private String firstName; 
	private Date birthDate;
	private String resume;
	
	
	public AnimalData(String firstName, Date birthDate, String resume) {		
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.resume = resume;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getResume() {
		return resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}


	@Override
	public int hashCode() {
		return this.birthDate.hashCode() * this.resume.hashCode() * this.firstName.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		AnimalData other = (AnimalData) obj;
		if (birthDate == null && other.birthDate != null) {
			return false;
		} else if (!birthDate.equals(other.birthDate)) {
			return false;
		}
		if (firstName == null && other.firstName != null) {			
			return false;
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (resume == null && other.resume != null) {
			return false;
		} else if (!resume.equals(other.resume)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "InfData [firstName=" + firstName + ", birthDate=" + birthDate
				+ ", resume=" + resume + "]";
	}	
}
