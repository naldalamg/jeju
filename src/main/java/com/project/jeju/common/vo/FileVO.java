package com.project.jeju.common.vo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("fileVO")
public class FileVO {

	private int fileNO;
	private String fileName;
	private String stored_fileName;
	private Date regDate;
	private int board_no;
	
	public int getFileNO() {
		return fileNO;
	}
	public void setFileNO(int fileNO) {
		this.fileNO = fileNO;
	}
	public String getFileName() {
	// 파일의 null과 blank 처리.
		try {
			if (fileName != null && fileName.length() != 0) {
				fileName = URLDecoder.decode(fileName, "utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fileName;
	}
	public void setFileName(String fileName) {
		try {
			if (fileName != null && fileName.length() != 0) {
				this.fileName = URLEncoder.encode(fileName, "utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public String getStored_fileName() {
		return stored_fileName;
	}
	public void setStored_fileName(String stored_fileName) {
		this.stored_fileName = stored_fileName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	
}
