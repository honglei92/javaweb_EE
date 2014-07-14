<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" type="text/javascript" 
src="My97DatePicker/WdatePicker.js"></script>
<title>学生成绩管理系统</title>
</head>
<body bgcolor="#FFFFFF">
	<h3>请填写课程信息</h3>
	<hr>
	<form action="addKc.action" method="post">
		<table border="0" cellspacing="0" cellpadding="1">
			<tr>
				<td>
					<label>课程号</label>
					<input type="text" name="kc.kch">
				</td>
			</tr>
			<tr>
				<td>
					<label>课程名</label>
					<input type="text" name="kc.kcm">
				</td>
			</tr>
			<tr>
				<td>
					<label>开学学期</label>
					<input type="text" name="kc.kxxq">
				</td>
			</tr>
			<tr>
				<td>
					<label>学时</label>
					<input type="text" name="kc.xs">
				</td>
			</tr>
			<tr>
				<td>
					<label>学分</label>
					<input type="text" name="kc.xf">
				</td>
			</tr>
		</table>
		<p>
		<input type="submit" value="添加">
		<input type="reset" value="重置">
	</form>
</body>
</html>