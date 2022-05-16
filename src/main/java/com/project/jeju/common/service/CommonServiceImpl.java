package com.project.jeju.common.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.project.jeju.common.dao.FileDAO;
import com.project.jeju.common.utils.FileUtils;

@Service("commonServiceImpl")
public class CommonServiceImpl implements CommonService{

	private static final Logger log = LoggerFactory.getLogger(CommonServiceImpl.class);
	    
	    @Resource
	    private FileUtils fileUtils;
	    
	    @Resource
	    private FileDAO fileDAO;    
	
	    @Override
	    public void insertFileUpload(Map<String, Object> param, MultipartHttpServletRequest request) throws Exception {
	       
	    	String board_no = (String)param.get("board_no"); 
	    	System.out.println(board_no);
	    	List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(param, request);
	        
	    	for (int i = 0; i < list.size(); i++) {
	            Map<String, Object> vo = list.get(i);
	            
	            Map<String, Object> fileMap = new HashMap<String, Object>();
	            fileMap.put("fileName", vo.get("ORIGINAL_FILE_NAME"));
	            fileMap.put("stored_fileName", vo.get("STORED_FILE_NAME"));
	            fileMap.put("board_no", board_no);
	            
	            
	            fileDAO.insertFileUpload(fileMap);
	        
	        
	        //test
	        Iterator<String> iterator = request.getFileNames();
	        MultipartFile multipartFile = null;
	        while (iterator.hasNext()) {
	            multipartFile = request.getFile(iterator.next());
	            if (multipartFile.isEmpty() == false) {
	                log.debug("---------- file start ----------");
	                log.debug("name : " + multipartFile.getName());
	                log.debug("filename : " + multipartFile.getOriginalFilename());
	                log.debug("size : " + multipartFile.getSize());
	                log.debug("---------- file end ----------\n");
	            }
	        }
	        
	    	}
	    }
}
