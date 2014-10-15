package org.mjglezramos.animal;

import java.util.Set;

import org.mjglezramos.data.AnimalData;
import org.mjglezramos.data.Historial;
import org.mjglezramos.data.Skills;

/**
 * 
 * Interface that define some important informations
 * @author L0009604
 *
 */
public interface IAnimal {
	
	/* skills */
	Set<Skills> getSkills ();
	
	/* information data */
	AnimalData getInformationData (IAnimal animal);
	
	/* historial */
	Set<Historial> getHistorial (IAnimal animal);
}
