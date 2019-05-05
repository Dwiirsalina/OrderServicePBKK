package com.pbkk.model;

import java.util.Set;

public class Pesanan {
	private Integer idpesanan;
	private String alamatpengantaran;
	private Integer totalharga;
	private Integer status;
	private String catatan;
	
//	@ManyToMany
//	@JoinTable
//		name="menu_like",
//		joinColumns = @JoinColumn(name = "idpesanan"),
//		inverseJoinColumns = @JoinColumn(name = "idmenu")
//	Set<Menu> likedMenus;
	
	public Integer getIdpesanan() {
		return idpesanan;
	}
	public void setIdpesanan(Integer idpesanan) {
		this.idpesanan = idpesanan;
	}
	public String getAlamatpengantaran() {
		return alamatpengantaran;
	}
	public void setAlamatpengantaran(String alamatpengantaran) {
		this.alamatpengantaran = alamatpengantaran;
	}
	public Integer getTotalharga() {
		return totalharga;
	}
	public void setTotalharga(Integer totalharga) {
		this.totalharga = totalharga;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCatatan() {
		return catatan;
	}
	public void setCatatan(String catatan) {
		this.catatan = catatan;
	}
	public Pesanan(Integer idpesanan, String alamatpengantaran, Integer totalharga, Integer status, String catatan) {
		this.idpesanan = idpesanan;
		this.alamatpengantaran = alamatpengantaran;
		this.totalharga = totalharga;
		this.status = status;
		this.catatan = catatan;
	}
	
	

}
