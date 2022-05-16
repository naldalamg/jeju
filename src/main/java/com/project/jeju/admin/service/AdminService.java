package com.project.jeju.admin.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.jeju.admin.dao.AdminDAO;
import com.project.jeju.admin.vo.AdminVO;

@Service("adminService")
public class AdminService {

	@Autowired
	private BCryptPasswordEncoder bPasswordEncoder;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//관리자 등록
	public boolean addAdmin(AdminVO adminVO) {
		AdminDAO dao = sqlSession.getMapper(AdminDAO.class);
		//비밀번호 암호화
		adminVO.setAdmin_pw(bPasswordEncoder.encode(adminVO.getAdmin_pw()));
		if (adminVO != null) {
			dao.addAdmin(adminVO);
			return true;
		}
		else
			return false;
	}
}
