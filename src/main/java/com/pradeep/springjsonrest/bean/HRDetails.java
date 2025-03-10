package com.pradeep.springjsonrest.bean;

public class HRDetails extends DepartmentDetails {
	private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
