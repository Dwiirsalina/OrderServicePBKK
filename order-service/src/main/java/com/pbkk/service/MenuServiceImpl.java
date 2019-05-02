package com.pbkk.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pbkk.model.Menu;

public class MenuServiceImpl {
	
	@Autowired 
	PelangganService pelangganService;
	
	public static List<Menu> menus;
	
	public MenuServiceImpl() {
		menus = new LinkedList<>();
		
	}

	public List<Menu> getSemuaMenu() {
		return menus;
	}

}
