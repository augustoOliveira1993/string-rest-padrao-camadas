package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.User;

public class UserInsertDTO {

	private String name;
	private String email;
	private String password;
	
	public UserInsertDTO() {

	}

	public UserInsertDTO(Long id, String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public UserInsertDTO(User entity) {
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.password = entity.getPassword();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
