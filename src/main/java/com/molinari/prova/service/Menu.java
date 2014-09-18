package com.molinari.prova.service;

import java.util.ArrayList;

public class Menu {
	
	public Menu(){
	}
	private String url;
	private String nome;
	private boolean hasSub;
	private ArrayList<Menu> submenus = null;
	
	public ArrayList<Menu> getSubmenus() {
    	return submenus;
    }
	public void setSubmenus(final ArrayList<Menu> submenus) {
    	this.submenus = submenus;
    }
	public String getUrl() {
    	return url;
    }
	public void setUrl(final String url) {
    	this.url = url;
    }
	public String getNome() {
    	return nome;
    }
	public void setNome(final String nome) {
    	this.nome = nome;
    }
	
	public boolean isHasSub() {
    	return hasSub = submenus != null && submenus.size() > 0;
    }
	public void setHasSub(final boolean hasSub) {
    	this.hasSub = hasSub;
    }
	public static Menu creaSingleMenu(){
		Menu menu = new Menu();
		menu.nome = "Menu";
		menu.url = "index.html";
		return menu; 
	}
	
	public static ArrayList<Menu> creaMenu(){
		ArrayList<Menu> menus = new ArrayList<Menu>();
		for(int i = 0; i < 5; i++){
			Menu menu = creaSingleMenu();
			menus.add(menu);
		}
		return menus;
	}

	
}
