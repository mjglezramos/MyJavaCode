package org.mjglezramos.data;

import java.util.Date;


/**
 * Historial of an animal
 * @author L0009604
 *
 */
public class Historial {
		
	private String event; 
	
	private String description;
	
	private Date startDate;
	
	private Date endDate;

	public Historial(String event, 
			String description, Date startDate,	Date endDate) {
		this.event = event;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
