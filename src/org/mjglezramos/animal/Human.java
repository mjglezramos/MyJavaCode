package org.mjglezramos.animal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.mjglezramos.data.AnimalData;
import org.mjglezramos.data.Historial;
import org.mjglezramos.data.HumanData;
import org.mjglezramos.data.Skills;

/**
 * Class that mantain all the information about an human
 * this information is like a CV
 * @author L0009604
 *
 */
public abstract class Human implements IAnimal{

	/* Information Data of the Human */
	AnimalData data;
	
	/* Skills of the animal */
	Set<Skills> skills;
	
	/* Historial of the animal */
	Set<Historial> historials;
	
	public Human(String firstName, 
			Date birthDate, String resume, String lastName, String email) {
		/* Create a new Data Information */
		this.data = new HumanData(firstName, birthDate, resume, lastName, email);
		
		/* Create the skills set */
		createSkillsData();
		
		/* Create the historial information */
		createHistorial();
		
	}

	@Override
	public Set<Skills> getSkills() {
		return skills;
	}

	@Override
	public AnimalData getInformationData(IAnimal animal) {
		return data;
	}

	@Override
	public Set<Historial> getHistorial(IAnimal animal) {		
		return historials;
	}
	
	/**
	 * Insert a new skill
	 * @param skill
	 */
	public void insertNewSkill (Skills skill) {
		if (this.skills != null) {
			this.skills.add(skill);
		}
	}		
	/**
	 * Insert a new Historial
	 */
	public void insertNewHistorial (Historial historial) {
		if (this.historials != null) {
			this.historials.add(historial);
		}
	}
	
	
	public AnimalData getData() {
		return data;
	}

	public void setData(AnimalData data) {
		this.data = data;
	}

	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}

	public void setHistorials(Set<Historial> historials) {
		this.historials = historials;
	}
	
	/**
	 * Create a new Historial
	 * 
	 */
	private void createHistorial() {
		this.historials = new HashSet<Historial>();	
	}

	/**
	 * Create a new Skills Set
	 * 
	 */
	private void createSkillsData() {
		this.skills = new HashSet<Skills>();		
	}

	@Override
	public int hashCode() {
		return data.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	
}
