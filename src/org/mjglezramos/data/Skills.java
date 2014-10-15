package org.mjglezramos.data;

/**
 * 
 * @author L0009604
 *
 */
public class Skills {
	
	private String skillTitle;
	private float profit;
	
	/**
	 * Constructor for default skill
	 * @param skillTitle
	 */
	public Skills (String skillTitle) {
		/* New Skill */
		this.skillTitle = skillTitle;
		
		/* Default profit */
		this.profit = 0;
	}
	
	/**
	 * Contructor for a skill and its profit
	 * @param skilTitle
	 * @param profit
	 */
	public Skills (String skillTitle, float profit) {
		/* New Skill */
		this.skillTitle = skillTitle;
		
		/* Default profit */
		this.profit = profit;
	}

	public String getSkillTitle() {
		return skillTitle;
	}

	public void setSkillTitle(String skillTitle) {
		this.skillTitle = skillTitle;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	
	
	@Override
	public int hashCode() {
		return this.skillTitle.hashCode() * Float.floatToIntBits(this.profit);
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
		Skills other = (Skills) obj;
		if (Float.floatToIntBits(profit) != Float.floatToIntBits(other.profit)) {
			return false;
		}	
		if (skillTitle == null && other.skillTitle != null) {			
				return false;				
		} else if (!skillTitle.equals(other.skillTitle)) {
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Skills [skillTitle=" + skillTitle + ", profit=" + profit + " %]";
	}
	
}
