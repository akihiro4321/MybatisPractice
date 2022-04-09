package com.example.springmybatis.da.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * ユーザー
 */
public class User {
    /**
     * ID
     */
    private int id;
    /**
     * ユーザー名
     */
    private String userName;
    /**
     * Eメールアドレス
     */
    private String email;

    /**
     * 作成日時
     */
    private LocalDateTime created;

    /**
     * メモ
     */
    private String memo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
    
    
}
