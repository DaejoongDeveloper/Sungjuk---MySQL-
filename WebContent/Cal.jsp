<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#main {
	width: 500px;
	height: 65px;
	margin: 20px auto;
	border: 10px solid #eee;
	padding: 20px;
	text-align: center;
		}
#main3 {
	width: 500px;
	height: 300px;
	margin: 5px auto;
	border: 10px solid #eee;
	padding: 20px;
	line-height: 200%;
}
</style>
</head>
<body>
<div id="main">
	<h1>성적표</h1>
</div>
<div id="main3">
<form action="Calculator" method="post">
	이름 : <input type="text" name="name"><br>
	학번 : <input type="text" name="id"><br>
	국어 : <input type="text" name="korea"><br>	
	영어 : <input type="text" name="english">	<br>
	수학 : <input type="text" name="math"><br><br>
	<input style="float: right" type="submit" value="성적조회">
	</form>
</div>
</body>
</html>