package com.project.jeju.common.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component("UserVO")
public class UserVO implements UserDetails{

	private String admin_id;
	private String admin_pw;
	private boolean admin_enabled;
	private ArrayList<GrantedAuthority> admin_auth;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return admin_auth;
	}
	
	public void setAuthority(ArrayList<String> authList) {
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		for(int i=0;i<authList.size();i++) {
			auth.add(new SimpleGrantedAuthority(authList.get(i)));
		}
		this.admin_auth=auth;
	}
	
	@Override
	public String getPassword() {
		return admin_pw;
	}
	

	public void setPassword(String password) {
		this.admin_pw = password;
	}

	@Override
	public String getUsername() {
		return admin_id;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return admin_enabled;
	}
	
	
}
