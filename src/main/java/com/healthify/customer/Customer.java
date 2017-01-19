package com.healthify.customer;

import java.util.Date;

public class Customer {
    private long id;
    private String name;
    private String middlename;
    private String lastname;
    private String gender;
    private Date dateofbirth;
    private String email;
	private Number phone;
    private String employer;
    private String address;
    private String city;
    private String state;
    private Number zip;
    
     


	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the middlename
	 */
	public final String getMiddlename() {
		return middlename;
	}

	/**
	 * @param middlename the middlename to set
	 */
	public final void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	/**
	 * @return the lastname
	 */
	public final String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public final void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the gender
	 */
	public final String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public final void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateofbirth
	 */
	public final Date getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * @param dateofbirth the dateofbirth to set
	 */
	public final void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public final Number getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(Number phone) {
		this.phone = phone;
	}

	/**
	 * @return the employer
	 */
	public final String getEmployer() {
		return employer;
	}

	/**
	 * @param employer the employer to set
	 */
	public final void setEmployer(String employer) {
		this.employer = employer;
	}

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public final Number getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public final void setZip(Number zip) {
		this.zip = zip;
	}

	public Customer() {
    }
 
    public Customer(String name, String middlename, String lastname,String gender,Date dateofbirth,String email,Number phone,String employer,
    		String address,String city,String state,Number zip)
    		 {
        this.id = (new Date()).getTime();
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.phone = phone;
        this.employer = employer;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        
        
    } 
 
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + dateofbirth + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", employer='" + employer + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
