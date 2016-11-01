package br.com.javafullstack.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue
	int userId;

	@ManyToOne(fetch = FetchType.EAGER)
	Department department;

	@ManyToMany
	Set<Permission> permissionList;

	String userName;
	String userDescription;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", department=" + department + ", permissionList=" + permissionList
				+ ", userName=" + userName + ", userDescription=" + userDescription + "]";
	}

}
