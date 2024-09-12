package com.practice.entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message="User name can not be Empty !!")
	@Size(min=3,max=12,message="User name must be between 3 and 12 Characters!!")
    private String userName;
	
private String email;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "LoginData [userName=" + userName + ", email=" + email + "]";
}


}
