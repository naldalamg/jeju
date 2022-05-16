<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<title>File Upload Test</title>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript">

	/* 파일 업로드 동적으로 추가 */
	var cnt = 1;
	function fn_addFile() {
		$("#d_file").append("<br>"+"<input type='file' name='file" + cnt + "'>");
		cnt++;
	}
</script>

</head>

<form id="frm" name="frm" method="post" enctype="multipart/form-data" action="${contextPath }/file/upload"> 

파일 첨부: <input type="button" value="파일추가" onclick="fn_addFile()">
				
				<div id="d_file"></div>


 <input type="submit" value="작성">
 <input type="hidden" value="110002" name="board_no">

 
 </form> 
 


 </body> 
 
 </html>

