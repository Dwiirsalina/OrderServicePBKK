package com.pbkk.restapp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.service.PesananService;
import com.pbkk.util.Util;

@RestController
@RequestMapping("/pesanan")
public class PesananController {
	@Autowired
	PesananService pesananService;
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> buatPesanan(
	@RequestParam(value="idpesanan") Integer idpesanan,
	@RequestParam(value="alamatpengantaran") String alamatpengantaran,
	@RequestParam(value="totalharga") Integer totalharga,
	@RequestParam(value="status") Integer status,
	@RequestParam(value="catatan") String catatan)
	{
		Map<String, Object> map = new LinkedHashMap<>();
		pesananService.buatPesanan(idpesanan, alamatpengantaran, totalharga, status, catatan);
		map.put("result", "added");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Map<String, Object> perbaruiPesanan(
	@RequestParam(value="idpesanan") Integer idpesanan,
	@RequestParam(value="status") Integer status
	){
	Map<String, Object> map = new LinkedHashMap<>();
	pesananService.perbaruiPesanan(idpesanan, status);
	map.put("result", "updated");
	return map;
	}
}
