package com.study.pojo;

/**
 * @author jettle 2017-07-31
 * @description 用户实体类 
 */
public class User {
    //User属性名与mysql中的users表的字段名一致
	private int id;
	private String username;
	private String password;
	private int administrator;
	
	public User(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdministrator() {
		return administrator;
	}

	public void setAdministrator(int administrator) {
		this.administrator = administrator;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", administrator=" + administrator + "]";
	}

	
}
