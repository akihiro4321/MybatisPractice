package com.example.springmybatis.da.query;

import lombok.Data;

import java.time.LocalDate;

public class SomeTableSelectQuery {
    private LocalDate fromNumberDate;
    private LocalDate toNumberDate;
    private Integer stringInteger;
    private Boolean stringBoolean;
	public LocalDate getFromNumberDate() {
		return fromNumberDate;
	}
	public void setFromNumberDate(LocalDate fromNumberDate) {
		this.fromNumberDate = fromNumberDate;
	}
	public LocalDate getToNumberDate() {
		return toNumberDate;
	}
	public void setToNumberDate(LocalDate toNumberDate) {
		this.toNumberDate = toNumberDate;
	}
	public Integer getStringInteger() {
		return stringInteger;
	}
	public void setStringInteger(Integer stringInteger) {
		this.stringInteger = stringInteger;
	}
	public Boolean getStringBoolean() {
		return stringBoolean;
	}
	public void setStringBoolean(Boolean stringBoolean) {
		this.stringBoolean = stringBoolean;
	}
    
    
}
