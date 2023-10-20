package com.uap.it1311l.registrationapi.model;

public class Attendee {
	String attendeeID = ""; 
	String firstName = "";
	String middleName = "";
	String lastName = "";
	String course = "";
	Integer age = 0; 
	
	public String getAttendeeID() {
		return attendeeID;
	}
	public void setAttendeeID(String attendeeID) {
		this.attendeeID = attendeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
