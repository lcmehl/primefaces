package br.com.javafullstack.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERMISSION")
public class Permission {

	@Id
	@GeneratedValue
	int permissionId;

	@ManyToMany
	Set<User> userList;

	String permissionName;
	String permissionDescription;

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionDescription() {
		return permissionDescription;
	}

	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}

	@Override
	public String toString() {
		return "Permission [permissionId=" + permissionId + ", userList=" + userList + ", permissionName="
				+ permissionName + ", permissionDescription=" + permissionDescription + "]";
	}

}
