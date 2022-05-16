package com.project.jeju.common.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository("fileDAO")
public class FileDAO extends AbstractDAO{

	public void insertFileUpload(Map<String, Object> map) {
        insert("file.insertFileUpload", map);
    }
}
