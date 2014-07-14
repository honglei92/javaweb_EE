<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>My JSP 'left.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/left.css">

</head>

<body bgcolor="#999999">
	<table border="0" cellpadding="0" cellspacing="0" bgcolor="#999999"
		width="180px">
		<tr>
			<td><h4>&nbsp;学生信息管理</h4>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="add.action" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;学生信息录入
			</a>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="showStudent" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;学生信息查询</a>
			</td>
		</tr>
		<tr>
			<td><h4>&nbsp;课程信息管理</h4>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="addCourseView" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;课程信息录入
			</a>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="showCourseView" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;课程信息查询</a>
			</td>
		</tr>
		<tr>
			<td><h4>&nbsp;学生成绩管理</h4>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="addScoreView" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;学生成绩录入
			</a>
			</td>
		</tr>
		<tr height="40px">
			<td><a href="showScoreView" target="_parent">&nbsp;&nbsp;&nbsp;&nbsp;学生成绩查询</a>
			</td>
		</tr>
		<tr height="60px">
			<td><img src="../images/logo.jpg" align="right">
			</td>
		</tr>
		<tr>
			<td align="center"><a href="goToSuccess" target="_parent">&gt;&gt;首页&lt;&lt;</a>
			</td>
		</tr>
	</table>
</body>
</html>
