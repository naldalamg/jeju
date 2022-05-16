package com.project.jeju.menu.vo;

import org.springframework.stereotype.Component;

@Component("menuVO")
public class MenuVO {

	private String menu_code;
	private String menu_up_code;
	private String menu_name;
	private String menu_enabled;
	private String menu_url;
	private int menu_sort_order;
	
	public String getMenu_code() {
		return menu_code;
	}
	public void setMenu_code(String menu_code) {
		this.menu_code = menu_code;
	}
	public String getMenu_up_code() {
		return menu_up_code;
	}
	public void setMenu_up_code(String menu_up_code) {
		this.menu_up_code = menu_up_code;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_enabled() {
		return menu_enabled;
	}
	public void setMenu_enabled(String menu_enabled) {
		this.menu_enabled = menu_enabled;
	}
	public String getMenu_url() {
		return menu_url;
	}
	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
	public int getMenu_sort_order() {
		return menu_sort_order;
	}
	public void setMenu_sort_order(int menu_sort_order) {
		this.menu_sort_order = menu_sort_order;
	}
	
	
}
