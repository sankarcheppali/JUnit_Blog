package net.icircuit.junitblog;

public class UserProfile {
 private String userName;
 private String accNo;
 
 public UserProfile(String userName){
	 this.userName=userName;
 }
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
 
}
