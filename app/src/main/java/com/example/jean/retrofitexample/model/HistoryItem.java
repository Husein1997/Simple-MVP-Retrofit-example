package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class HistoryItem{

	@SerializedName("id")
	private int id;

	@SerializedName("klub")
	private String klub;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setKlub(String klub){
		this.klub = klub;
	}

	public String getKlub(){
		return klub;
	}

	@Override
	public String toString() {
		return "HistoryItem{" +
				"id=" + id +
				", klub='" + klub + '\'' +
				'}';
	}
}