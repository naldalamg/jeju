package com.project.jeju.admin.dao;

import org.springframework.stereotype.Repository;

import com.project.jeju.admin.vo.AdminVO;

@Repository("adminDAO")
public interface AdminDAO {

	//관리자 등록
	public void addAdmin(AdminVO adminVO);
}
