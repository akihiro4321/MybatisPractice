package com.example.springmybatis.da.entity;


import java.time.LocalDateTime;

import lombok.Data;

/**
 * 問合せタグ(inquiry_tag)
 */
public class InquiryTag {
    /**
     * ID
     */
    private int id;
    /**
     * 問合せID
     */
    private int inquiryId;
    /**
     * 記述(タグ名)
     */
    private String description;
    /**
     * 作成日時
     */
    private LocalDateTime created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInquiryId() {
		return inquiryId;
	}
	public void setInquiryId(int inquiryId) {
		this.inquiryId = inquiryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
    
    
}
