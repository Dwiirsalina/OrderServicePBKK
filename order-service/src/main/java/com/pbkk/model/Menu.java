package com.pbkk.model;

import java.util.Set;

public class Menu {
	private Integer idmenu;
	private String namamenu;
	private String detilmenu;
	private Integer hargamenu;
	private Integer stockmenu;
	
	@ManyToMany
	Set<Pesanan> likes;
	
	public Integer getIdmenu() {
		return idmenu;
	}
	public void setIdmenu(Integer idmenu) {
		this.idmenu = idmenu;
	}
	public String getNamamenu() {
		return namamenu;
	}
	public void setNamamenu(String namamenu) {
		this.namamenu = namamenu;
	}
	public String getDetilmenu() {
		return detilmenu;
	}
	public void setDetilmenu(String detilmenu) {
		this.detilmenu = detilmenu;
	}
	public Integer getHargamenu() {
		return hargamenu;
	}
	public void setHargamenu(Integer hargamenu) {
		this.hargamenu = hargamenu;
	}
	public Integer getStockmenu() {
		return stockmenu;
	}
	public void setStockmenu(Integer stockmenu) {
		this.stockmenu = stockmenu;
	}
	

}
