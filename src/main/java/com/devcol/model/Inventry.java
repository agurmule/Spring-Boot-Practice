package com.devcol.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Inventry {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String inName;
	private Date inDate;
	private Date createDate;
	private int inV1;
	private int inV2;
	private int inV3;
	private String firstname;

	public Inventry() {
		super();
	}

	/**
	 * @param id
	 * @param inName
	 * @param inDate
	 * @param createDate
	 * @param inV1
	 * @param inV2
	 * @param inV3
	 * @param firstname
	 */
	public Inventry(int id, String inName, Date inDate, Date createDate, int inV1, int inV2, int inV3,
			String firstname) {
		super();
		this.id = id;
		this.inName = inName;
		this.inDate = inDate;
		this.createDate = createDate;
		this.inV1 = inV1;
		this.inV2 = inV2;
		this.inV3 = inV3;
		this.firstname = firstname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the inName
	 */
	public String getInName() {
		return inName;
	}

	/**
	 * @param inName the inName to set
	 */
	public void setInName(String inName) {
		this.inName = inName;
	}

	/**
	 * @return the inDate
	 */
	public Date getInDate() {
		return inDate;
	}

	/**
	 * @param inDate the inDate to set
	 */
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the inV1
	 */
	public int getInV1() {
		return inV1;
	}

	/**
	 * @param inV1 the inV1 to set
	 */
	public void setInV1(int inV1) {
		this.inV1 = inV1;
	}

	/**
	 * @return the inV2
	 */
	public int getInV2() {
		return inV2;
	}

	/**
	 * @param inV2 the inV2 to set
	 */
	public void setInV2(int inV2) {
		this.inV2 = inV2;
	}

	/**
	 * @return the inV3
	 */
	public int getInV3() {
		return inV3;
	}

	/**
	 * @param inV3 the inV3 to set
	 */
	public void setInV3(int inV3) {
		this.inV3 = inV3;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


}