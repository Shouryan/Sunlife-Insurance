package com.model;

import java.util.ArrayList;
import java.util.List;

public class Users {
	private List<User> users;
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}
	public List<User> getUsers() {
		if(users==null) {
			users = new ArrayList<>();
		}
		return users;
	}
}
