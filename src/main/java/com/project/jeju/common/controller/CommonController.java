package com.project.jeju.common.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.project.jeju.common.service.CommonService;
import com.project.jeju.common.utils.ParamCollector;

@Controller("CommonController")
public class CommonController {

	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value="/login.html")
	public String login(Model model) throws Exception {
		return "login";
	}	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//file upload
	@RequestMapping(value = "/file", method = RequestMethod.GET)
    public ModelAndView getFilePage(ParamCollector inparams) {
        ModelAndView mav = new ModelAndView("fileUpload");
        return mav;
    }
	
//	  @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
//	    public ModelAndView getFile(@RequestParam Map<String, Object> param, MultipartHttpServletRequest request) throws Exception {
//	        ModelAndView mav = new ModelAndView("jsonView");
//	        
//	        commonService.insertFileUpload(param, request);
//	        return mav;
//	    }
	  
	  @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
	    public String getFile(@RequestParam Map<String, Object> param, MultipartHttpServletRequest request) throws Exception {
	        
	        commonService.insertFileUpload(param, request);
	        return "fileUpload";
	    }
}
