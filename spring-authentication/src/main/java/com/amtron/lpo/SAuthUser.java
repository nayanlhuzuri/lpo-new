package com.amtron.lpo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "SpringAuthentication")
public class SAuthUser {

	@Id
	private Long id;
	private String userName;
	private String password;
	private String role;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
}
