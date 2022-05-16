<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
<%-- 
<link href="${path}/resources/css/font.css" rel="stylesheet"/>
<link href="${path}/resources/css/signForm.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" integrity="sha512-aOG0c6nPNzGk+5zjwyJaoRUgCdOrfSDhmMID2u4+OIslr0GjpLKo7Xm0Ao3xmpM4T8AmIouRkqwj1nrdVsLKEQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../jquery-ui-1.13.1.custom/jquery-ui-1.13.1.custom/jquery-ui.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" integrity="sha512-uto9mlQzrs59VwILcLiRYeLKPPbS/bT71da/OEBYEwcdNUk8jYIy+D176RYoop1Da+f9mvkYrmj5MCLZWEtQuA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
 --%>
<script>

</script>

 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>

<form action="${contextPath}/addAdmin.do" method="post">

    <!-- header -->
<%--     <div id="header">
        <a href="${contextPath }/main.html" title="회원가입">
        <img src="${contextPath}/resources/image/logo.png"></a>
        <h3 class="main-name">회원가입</h3>
    </div> --%>


    <!-- wrapper -->
    <div id="wrapper">

        <!-- content-->
        <div id="content">

            <!-- ID -->
            <div>
                <h3 class="join_title">
                    <label for="id">아이디</label>
                    &nbsp<span id="idch"></span>
                </h3>
                 <!-- <h3 id="idch" class="reg_check"> </h3> -->
                <span class="box int_id">
                    <input type="text" id="id" name="admin_id" class="intid" maxlength="20">
               </span> 
                
                <span class="error_next_box"></span>
               
            </div>

            <!-- PW1 -->
            <div>
                <h3 class="join_title">
                <label for="pswd1">비밀번호</label>
                 &nbsp<span id="pwch1"></span>
                </h3>
                <span class="box int_pass">
                    <input type="password" id="pswd1" name="admin_pw" class="int" maxlength="20">
                    <span id="alertTxt">사용불가</span>
                </span>
                <span class="error_next_box"></span>
                <!-- <p id="pwch1" class="reg_check"> </p> -->
            </div>

            <!-- PW2 -->
<!--             <div>
                <h3 class="join_title">
                <label for="pswd2">비밀번호 재확인</label>
                &nbsp<span id="pwch2"></span>
                </h3>
                <span class="box int_pass_check">
                    <input type="password" id="pswd2" class="int" maxlength="20">
                </span>
                <span class="error_next_box"></span>
                <p id="pwch2" class="reg_check"> </p>
            </div> -->

            <!-- NAME -->
            <div>
                <h3 class="join_title">
                <label for="name">이름</label>
                &nbsp<span id="namech"></span>
                </h3>
                <span class="box int_name">
                    <input type="text" id="name" name="admin_name"class="int" maxlength="20">
                </span>
                <span class="error_next_box"></span>
                <!-- <p id="namech" class="reg_check"> </p> -->
            </div>

           
			<!-- E-mail agree -->
			<br>
			<div class="mail-agree">
              	<div class="mail-agreeok">
	               	<label for="emailagree">
	              		<input type="radio" id="emailagree" name="admin_auth" class="agree_chk" value="ROLE_ADMIN">ROLE_ADMIN
	              	</label>
	              	<br>
	              	<label for="emailagree">
	              		<input type="radio" id="emailagree" name="admin_auth" class="agree_chk" value="ROLE_ADMIN_MENU" checked>ROLE_ADMIN_MENU
	              	</label>
            	</div>
            </div>
            
            <!-- JOIN BTN-->
<!--             <div class="btn_area">
                <button type="button" id="btnJoin" onclick="regist()">
                    <span>가입하기</span>
                </button>
            </div> -->
	<input type="submit" value="등록하기">            
        </div>
    </div>
    
</form>

</body>
</html>