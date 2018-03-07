package com.fusemachine.springdataJpa.Jpa.SingleTableStrategy.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="NS")
public class NonTeachingStaff extends Staff {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String areaexpertise;

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaff(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaff(int sid, String sname) {
		super(sid, sname);
	}

	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
