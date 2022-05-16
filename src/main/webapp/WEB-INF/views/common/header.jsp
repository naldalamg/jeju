<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상단부</title>
</head>


<body>

	<table border=0 width="100%">
		<tr>
			<td>
				<a href="${contextPath }/member/home">
					<img src="${contextPath }/resources/image/logo.png">
				</a>
			</td>
			<td>
				<p><font size=5>제주귀어어촌종합지원센터</font></p>
			</td>
			<td>
				
				<div id='h-login'>
                	<sec:authorize access="isAnonymous()">
                    	<a class="h-log" href="${contextPath}/login.html">관리자 로그인 &nbsp&nbsp</a>
                    </sec:authorize>
                    
                    <sec:authorize access="isAuthenticated()">
                     	<sec:authentication property="name"/>님.&nbsp&nbsp
					  	<!-- <a class="h-log" href="#" onclick="document.getElementById('logout').submit();">로그아웃</a> -->
					  	<a class="h-log" href="${contextPath}/logout">로그아웃&nbsp&nbsp</a>
					  	<a class="h-log" href="${contextPath}/signForm.html">관리자 추가 &nbsp&nbsp </a>
					</sec:authorize>
					<%-- <form id="logout"  action="${path}/security_logout" method="POST">
					   	<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
					</form> --%>
                   
                    
                </div>
 		
			</td>
		</tr>
	</table>
	
	
</body>
</html>







