package com.chimertech.quadmastest.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Parameter")
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parameterID;

    private String parameterName;
    private String description;
	public Long getParameterID() {
		return parameterID;
	}
	public void setParameterID(Long parameterID) {
		this.parameterID = parameterID;
	}
	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    // Other relevant parameter information fields go here

    // Getters and setters
}
