<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>档案数字化注册页面</title>
<style type="text/css">
<!--
body {
	MARGIN: 0px;
	background-image: url(images/bg.jpg);
}
-->
</style>
</head>
<body>
<form method="post" action="RegistServlet">
<table width="462" align="center" border="2">
<tr><td>用户名：<input type="text" name="username"></td></tr>
<tr><td>密&nbsp;&nbsp;码：<input type="password" name="password"></td></tr>
<tr><td><input type="reset" value="重置">
<input type="submit" value="提交"></td></tr>
</table>
</form>
</body>
</html>