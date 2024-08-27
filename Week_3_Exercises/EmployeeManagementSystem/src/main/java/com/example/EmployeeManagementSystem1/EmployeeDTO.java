package com.example.EmployeeManagementSystem1;

public class EmployeeDTO {
    private String name;
    private String departmentName;

    public EmployeeDTO(String name, String departmentName) {
        this.setName(name);
        this.setDepartmentName(departmentName);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

    
}
