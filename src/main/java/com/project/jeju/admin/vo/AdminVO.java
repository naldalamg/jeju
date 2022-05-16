package com.project.jeju.admin.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("adminVO")
public class AdminVO {

	private String admin_id;
	private String admin_pw;
	private int amind_pw_failure;
	private Date admin_pw_period;
	private String admin_name;
	private Date admin_id_reg;
	private Date admin_pw_mod;
	private String admin_enabled;
	private String admin_auth;
	
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pw() {
		return admin_pw;
	}
	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}
	public int getAmind_pw_failure() {
		return amind_pw_failure;
	}
	public void setAmind_pw_failure(int amind_pw_failure) {
		this.amind_pw_failure = amind_pw_failure;
	}
	public Date getAdmin_pw_period() {
		return admin_pw_period;
	}
	public void setAdmin_pw_period(Date admin_pw_period) {
		this.admin_pw_period = admin_pw_period;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public Date getAdmin_id_reg() {
		return admin_id_reg;
	}
	public void setAdmin_id_reg(Date admin_id_reg) {
		this.admin_id_reg = admin_id_reg;
	}
	public Date getAdmin_pw_mod() {
		return admin_pw_mod;
	}
	public void setAdmin_pw_mod(Date admin_pw_mod) {
		this.admin_pw_mod = admin_pw_mod;
	}
	public String getAdmin_enabled() {
		return admin_enabled;
	}
	public void setAdmin_enabled(String admin_enabled) {
		this.admin_enabled = admin_enabled;
	}
	public String getAdmin_auth() {
		return admin_auth;
	}
	public void setAdmin_auth(String admin_auth) {
		this.admin_auth = admin_auth;
	}
	
	
}
