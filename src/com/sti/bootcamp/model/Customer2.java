package com.sti.bootcamp.model;

public class Customer2 {
	private String norek;
	private String nama;
	private String alamat;
	
	public Customer2() {
		
	}
	
	public Customer2(String norek, String nama, String alamat) {
		this.norek = norek;
		this.nama = nama;
		this.alamat = alamat;
	}
	
	public String getNorek() {
		return norek;
	}
	public void setNorek(String norek) {
		this.norek = norek;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
}
