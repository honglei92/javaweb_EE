<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>

<title>用户登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/login.css">
<script language="javascript" type="text/javascript" src="../jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../js/login.js"></script>

</head>

<body>
	<div id="all">
		<label id="back"><a href="../jsp/main.jsp">&lt;&lt;返回</a> </label>
		<div id="login">
			<form method="post" action="login">
				<label class="title">学生成绩管理系统</label>
				<br>
				<label class="u">学&nbsp;&nbsp;&nbsp;&nbsp;号</label>
				<input type="text" id="username" name="loginInfo.sid" />
				<span id="error1">学号不能为空</span>
				<br>
				<br>
				<label class="p">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
				<input type="password" id="password" name="loginInfo.password" />
				<span id="error2">密码不能为空</span>
				<br>
				<br>
				<input type="submit" value="登录" class="submit" />
				<input type="reset" value="取消" class="reset" />
			</form>
		</div>
	</div>
</body>
</html>
