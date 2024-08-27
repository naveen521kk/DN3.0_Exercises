package com.example.EmployeeManagementSystem1;

public class EmployeeCustomDTO {
    private String fullName;

    public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public EmployeeCustomDTO(String fullName) {
        this.fullName = fullName;
    }

    
}
