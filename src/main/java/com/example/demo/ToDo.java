package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo {

	@Id
	String empId;
	String empName;
	
	public ToDo(){
		
	}
	
	public ToDo(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String getEmpId() {
			return empId;
	}
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	 @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("City{");
	        sb.append("id=").append(empId);
	        sb.append(", name='").append(empName);
	        sb.append('}');
	        return sb.toString();
	    }
}
