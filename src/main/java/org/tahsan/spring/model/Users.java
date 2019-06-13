package org.tahsan.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private Long id;	
	private String name;
	private String teamName;
	private int salary;
	
	public Users() {}
	
	public Users(Long id, String name, String teamName, int salary) {
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", teamName=" + teamName + ", salary=" + salary + "]";
	}

}
