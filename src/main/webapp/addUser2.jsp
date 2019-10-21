<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addUser2" method="post" enctype="multipart/form-data">
		<div>
			用户ID：<input type="text" name="uid">
		</div>
		<div>
			年龄：<input type="text" name="age">
		</div>
		<div>
			用户名：<input type="text" name="uname">
		</div>
		<div>
			头像：<input type="file" name="upload">
		</div>
		<div>
			<button type="submit">提交</button>
		</div>
	</form>

</body>
</html>