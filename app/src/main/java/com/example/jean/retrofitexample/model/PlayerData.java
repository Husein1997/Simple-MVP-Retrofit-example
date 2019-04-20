package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class PlayerData{

	@SerializedName("ikon")
	private String ikon;

	@SerializedName("nama")
	private String nama;

	@SerializedName("negara")
	private String negara;

	@SerializedName("id")
	private String id;

	@SerializedName("team")
	private String team;

	@SerializedName("posisi")
	private String posisi;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("nomor")
	private String nomor;

	@SerializedName("gambar")
	private String gambar;

	@SerializedName("age")
	private String age;

	public void setIkon(String ikon){
		this.ikon = ikon;
	}

	public String getIkon(){
		return ikon;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setNegara(String negara){
		this.negara = negara;
	}

	public String getNegara(){
		return negara;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public String getTeam(){
		return team;
	}

	public void setPosisi(String posisi){
		this.posisi = posisi;
	}

	public String getPosisi(){
		return posisi;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setNomor(String nomor){
		this.nomor = nomor;
	}

	public String getNomor(){
		return nomor;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"PlayerData{" + 
			"ikon = '" + ikon + '\'' + 
			",nama = '" + nama + '\'' + 
			",negara = '" + negara + '\'' + 
			",id = '" + id + '\'' + 
			",team = '" + team + '\'' + 
			",posisi = '" + posisi + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",nomor = '" + nomor + '\'' + 
			",gambar = '" + gambar + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}