package com.example.springmybatis.da.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * TypeHandler確認用テーブル
 */
public class SomeTable {
    /**
     * ID
     */
    private int id;
    /**
     * 数値型日付
     * DBではyyyyMMdd形式の数値でデータを保持している
     * MyBatisの標準のTypeHandlerで自動変換される
     */
    private LocalDate numberDate;
    /**
     * 文字型数値
     * DBでは文字列で数値を保持している
     * MyBatisの標準のTypeHandlerで自動変換される
     */
    private Integer stringInteger;
    /**
     * 文字列boolean
     * 独自TypeHandlerの確認用の列
     * true: +, false: - の形式で文字列でデータを保持している
     * 標準のTypeHandlerでは処理できないため、独自TypeHandlerが必要
     */
    private boolean stringBoolean;
    /**
     * 文字型リスト
     * カンマ区切りの形式でデータを保持している
     * 標準のTypeHandlerでは処理できないため、独自TypeHandlerが必要
     */
    private List<String> stringList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getNumberDate() {
		return numberDate;
	}
	public void setNumberDate(LocalDate numberDate) {
		this.numberDate = numberDate;
	}
	public Integer getStringInteger() {
		return stringInteger;
	}
	public void setStringInteger(Integer stringInteger) {
		this.stringInteger = stringInteger;
	}
	public boolean isStringBoolean() {
		return stringBoolean;
	}
	public void setStringBoolean(boolean stringBoolean) {
		this.stringBoolean = stringBoolean;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
    
    
}
