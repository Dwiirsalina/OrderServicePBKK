package com.pbkk.service;

public interface Pesanan {
	void buatPesanan(Integer idpesanan, String alamatpengantaran, Integer totalharga, Integer status, String catatan);
	void perbaruiStatusPesanan(Integer idpesanan, Integer status);
	
}
