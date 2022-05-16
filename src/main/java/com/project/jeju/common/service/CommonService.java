package com.project.jeju.common.service;

import java.util.Map;
import org.springframework.web.multipart.MultipartHttpServletRequest;


public interface CommonService {

	public void insertFileUpload(Map<String, Object> map, MultipartHttpServletRequest request) throws Exception;

}
