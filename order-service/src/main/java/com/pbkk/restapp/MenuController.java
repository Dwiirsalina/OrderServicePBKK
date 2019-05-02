package com.pbkk.restapp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.model.Menu;
import com.pbkk.service.PelangganService;
import com.pbkk.service.MenuService;

import com.pbkk.util.Util;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired 
	MenuService menuSevice;
	
//	@Autowired 
//	PelangganService pelangganSevice;
	
	@ResponseBody
	@RequestMapping("")
	public List<Menu> getSemuaMenus(){
		return menuSevice.getSemuaMenus();
	}

	@ResponseBody
	@RequestMapping(value = "/tambahmenu", method = RequestMethod.POST)
	public Map<String, Object> buatMenus(   
	  @RequestParam(value = "idmenu") Integer idmenu,
	  @RequestParam(value = "namamenu") String namamenu,
	  @RequestParam(value = "detilmenu") String detilmenu,
	  @RequestParam(value = "hargamenu") Integer hargamenu,
	  @RequestParam(value = "stockmenu") Integer stockmenu
	 ) {  
	 
	 menuSevice.buatMenus(idmenu, namamenu, detilmenu, hargamenu, stockmenu);
	 return Util.getSuccessResult();
	}

}
