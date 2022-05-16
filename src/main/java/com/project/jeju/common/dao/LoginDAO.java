package com.project.jeju.common.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.jeju.common.vo.UserVO;

@Repository
public interface LoginDAO {

	public UserVO selectUser(String username);
	public ArrayList<String> getAuthList(String username);

}
