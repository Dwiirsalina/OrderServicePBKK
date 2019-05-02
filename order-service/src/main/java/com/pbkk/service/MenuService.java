package com.pbkk.service;

import java.util.List;

import com.pbkk.model.Menu;

public interface MenuService {
	List<Menu> getSemuaMenus();
	void buatMenus(Integer idmenu, String namamenu, String detilmenu, Integer hargamenu, Integer stockmenu);
//	void perbaruiMenus(Integer idmenu, String namamenu, String detilmenu, Integer hargamenu, Integer stockmenu);
//	void hapusMenus(Menu menu, Integer idmenu);

}
