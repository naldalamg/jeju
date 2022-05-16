package com.project.jeju.common.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component("fileUtils")
public class FileUtils {
	
    private static final String filePath = "C:\\board\\upload\\";
    
    public boolean deleteFile(String storedFileName) {
        File file = new File(filePath + storedFileName);
        
        //upload가 있는지 확인
        //있을때만 작업한다
        if(file.exists()){
            if(file.delete()) {
                return true;
            }
        }
        return false;
    }
    
    public static List<Map<String,Object>> parseInsertFileInfo(Map<String,Object> map, MultipartHttpServletRequest request) throws Exception{
        
    	Iterator<String> iterator = request.getFileNames();
         
        MultipartFile multipartFile = null;
        String originalFileName = null;
        String originalFileExtension = null;
        String storedFileName = null;
         
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        Map<String, Object> listMap = null;
         
        File file = new File(filePath);
        //경로가 존재하지 않을 경우 디렉토리를 만든다.
        if(file.exists() == false){
            file.mkdirs();
        }
         
        while(iterator.hasNext()){
            multipartFile = request.getFile(iterator.next());
            if(multipartFile.isEmpty() == false){
                //업로드한 파일의 확장자를 포함한 파일명이다.
                originalFileName = multipartFile.getOriginalFilename();
                //업로드한 파일의 마지막 .을 포함한 확장자를 substring 한 것.
                originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
                //32자리의 숫자를 포함한 랜덤 문자열 + 확장자를 붙여준 파일명이다.
                storedFileName = CommonUtils.getRandomString() + originalFileExtension;
                 
                file = new File(filePath + storedFileName);
                multipartFile.transferTo(file);
                 
                listMap = new HashMap<String,Object>();
                //업로드할 당시의 파일이름
                listMap.put("ORIGINAL_FILE_NAME", originalFileName);
                //저장할 파일 이름
                listMap.put("STORED_FILE_NAME", storedFileName);
                listMap.put("FILE_SIZE", multipartFile.getSize());
                list.add(listMap);
            }
        }
        return list;
    }
}
