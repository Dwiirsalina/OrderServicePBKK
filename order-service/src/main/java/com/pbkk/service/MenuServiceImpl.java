package com.pbkk.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.pbkk.model.Menu;

@Service
public class MenuServiceImpl implements MenuService {
	
//	@Autowired 
//	PelangganService pelangganService;
	
	public static List<Menu> menus;
	
	public MenuServiceImpl() {
		menus = new LinkedList<>();
		
	}
	
	public List<Menu> getSemuaMenus() {
		return menus;
	}
	
	@Override
	 public void buatMenus(Integer idmenu, String namamenu, String detilmenu, Integer hargamenu, Integer stockmenu){
	  Menu menu = new Menu();  
	  this.menus.add(menu);
	 }

}
