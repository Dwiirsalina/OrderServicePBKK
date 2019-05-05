package com.pbkk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pbkk.model.Pesanan;

@Service
public class PesananServiceImpl implements PesananService {
	
	public static List<Pesanan> pesanans = new ArrayList<Pesanan>();
	 
	@Override
	public void buatPesanan(Integer idpesanan, String alamatpengantaran, Integer totalharga, Integer status, String catatan) {
		Pesanan pesanan = new Pesanan(idpesanan, alamatpengantaran, totalharga, status, catatan);
		pesanans.add(pesanan);
	}
	
	@Override
	public void perbaruiPesanan(Integer idpesanan, Integer status) {
	pesanans.stream()
	.filter(x -> x.getIdpesanan() == idpesanan)
	.findAny()
	.orElse(null)
	.setStatus(status);
	}
}
