<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#container {
		width: 100%;
		margin: 0px auto;
		text-align: center;
		border: 0px solid #bcbcbc;
	}
	
	#header {
		height: 100px;
		padding: 5px;
		margin-bottom: 5px;
		border-bottom: 1px solid #bcbcbc;
		background-color: white;
	}
	

	
	#footer {
		clear: both;
		padding: 5px;
		border: 0px solid #bcbcbc;
		background-color: lightblue;
	}
</style>
<!-- tiles_member.xml의 name="title"의 value를 가져온다. -->
<title><tiles:insertAttribute name="title" /></title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" /> <!-- name="header"의 jsp표시 -->
		</div>
		<%-- <div id="sidebar-left">
			<tiles:insertAttribute name="side" />
		</div> --%>
		<div id="content">
			<tiles:insertAttribute name="body" /> <!-- main.jsp -->
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>