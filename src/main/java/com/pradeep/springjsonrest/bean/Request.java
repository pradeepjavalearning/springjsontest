package com.pradeep.springjsonrest.bean;

public class Request {
    private String input;
    private DepartmentDetails details;

    // Getters and setters
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public DepartmentDetails getDetails() {
        return details;
    }

    public void setDetails(DepartmentDetails details) {
        this.details = details;
    }
}

