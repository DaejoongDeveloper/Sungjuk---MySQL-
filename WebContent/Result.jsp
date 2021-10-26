<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
	request.setCharacterEncoding("utf-8");
%>



<html>
<head>
<meta charset="UTF-8">
<title>성적 결과</title>
<style>
	#content {
		width: 300px;
		margin: 50px auto;
		border: 10px solid #eee;
		padding: 20px;
	}
</style>
</head>
<div id="content">
<body>
	이름 : ${name}<br>
	학번 : ${id}<br>
	국어 : ${korea}<br>
	영어 	: ${english}<br>
	수학 : ${math}<br>
	총점 : ${total}<br>
	평균 : ${average}<br>
	학점 : ${grade}
	
</body>
</div>
</html>