package com.pbkk.service;

public interface PesananService {
	void buatPesanan(Integer idpesanan, String alamatpengantaran, Integer totalharga, Integer status, String catatan);
	void perbaruiPesanan(Integer idpesanan, Integer status);
}
