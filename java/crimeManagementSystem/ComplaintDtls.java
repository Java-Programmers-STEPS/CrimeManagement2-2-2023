package crimeManagementSystem;

import java.sql.Blob;

public class ComplaintDtls {
private int id;
private String policestationname,petitionername,gender,address,complaintdetails,occupation;
private Blob idproof;
private int dateofbirth,dateofcomplaint,phonenumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPolicestationname() {
	return policestationname;
}
public void setPolicestationname(String policestationname) {
	this.policestationname = policestationname;
}
public String getPetitionername() {
	return petitionername;
}
public void setPetitionername(String petitionername) {
	this.petitionername = petitionername;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getComplaintdetails() {
	return complaintdetails;
}
public void setComplaintdetails(String complaintdetails) {
	this.complaintdetails = complaintdetails;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public Blob getIdproof() {
	return idproof;
}
public void setIdproof(Blob idproof) {
	this.idproof = idproof;
}
public int getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(int dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public int getDateofcomplaint() {
	return dateofcomplaint;
}
public void setDateofcomplaint(int dateofcomplaint) {
	this.dateofcomplaint = dateofcomplaint;
}
public int getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}



}
