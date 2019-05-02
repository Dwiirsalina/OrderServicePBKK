package com.pbkk.service;

import java.util.List;

import com.pbkk.model.Menu;

public interface MenuService {
	List<Menu> getSemuaMenu();
	void buatMenu(Integer idmenu, String namamenu, String detilmenu, Integer hargamenu, Integer stockmenu);
	void perbaruiMenu(Integer idmenu, String namamenu, String detilmenu, Integer hargamenu, Integer stockmenu);
	void hapusMenu(Menu menu, Integer idmenu);

}
