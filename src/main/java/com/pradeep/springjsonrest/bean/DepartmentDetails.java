package com.pradeep.springjsonrest.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = HRDetails.class, name = "HR"),
    @JsonSubTypes.Type(value = FinanceDetails.class, name = "Finance"),
    @JsonSubTypes.Type(value = ITDetails.class, name = "IT"),
    @JsonSubTypes.Type(value = MarketingDetails.class, name = "Marketing")
})
public abstract class DepartmentDetails {
	private String id;

	// Getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
