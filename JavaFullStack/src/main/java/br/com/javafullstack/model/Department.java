package br.com.javafullstack.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {

	@Id
    @GeneratedValue
	int departmentId;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="department", orphanRemoval=true)
	Set<User> usersList;
	
	String departmentName;
	String departmentDescription;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", usersList=" + usersList + ", departmentName="
				+ departmentName + ", departmentDescription=" + departmentDescription + "]";
	}

}
