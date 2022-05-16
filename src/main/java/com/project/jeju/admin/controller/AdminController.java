package com.project.jeju.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.jeju.admin.service.AdminService;
import com.project.jeju.admin.vo.AdminVO;

@Controller("adminController")
public class AdminController {
	
	@Autowired
	AdminService adminService;

	@RequestMapping("/signForm.html")
	public String signForm(Model model) {
		return "signForm";
	}
	
	@RequestMapping(value="/addAdmin.do", method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute("adminVO") AdminVO adminVO, HttpServletRequest request) {
		boolean isInserted = adminService.addAdmin(adminVO);
		if(isInserted) return "login";
		else return "signForm";
	}
}
