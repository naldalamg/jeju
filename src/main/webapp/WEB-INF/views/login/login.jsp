<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<link href="${contextPath}/resources/css/loginForm.css" rel="stylesheet"/> 	
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
<main class="form-all">

<form action="login_check" method="post">

	<c:if test="${LoginFailMessage != null}">
		<p> error : <c:out value="${LoginFailMessage}"/> </p>
	</c:if>

<%-- <img class="form-img" src="${path}/resources/image/logo.png"> --%>
    
   
    
    <div class="form-login">
   		<div class="form-title">로그인</div></br>
		<div class="form-id"><input type="text" name="user_id" class="form-control-id" id="floatingInput" placeholder="ID"></div> 
		<div class="form-pw"><input type="password" name="user_pw" class="form-control-pw" id="floatingPassword" placeholder="Password"></div></br>
		<button class="btn-primary" type="submit">Sign in</button>
    </div></br>
    
	<div class = "form-find">
		<ul class="test">
			<li><a href="#" class="find-id">아이디 찾기</a></li> 
			<li><a href="#" class="find-pw">비밀번호 찾기</a></li>
			<li><a href="#" class="find-new">회원가입</a></li>   
		</ul> 
	</div></br> 
	
    <!-- <p class="form-copyright">© 안구건조</p> -->
    
</form>
</main>

</body>
</html>