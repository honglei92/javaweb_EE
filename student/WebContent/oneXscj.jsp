<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#FFFFFF">
	<h3>该学生成绩如下：</h3>
	<hr>
	<table border="1" cellspacing="1" cellpadding="8" width="700">
		<tr>
			<th>姓名</th>
			<th>课程名</th>
			<th>成绩</th>
			<th>学分</th>
		</tr>
		<s:iterator value="#request.list" id="xscj">
			<tr>
			    <td><s:property value="#xscj[1]" /></td>
				<td><s:property value="#xscj[2]" /></td>
				<td><s:property value="#xscj[3]" /></td>
				<td><s:property value="#xscj[4]" /></td>
			</tr>
		</s:iterator>
	</table>
	<input type="button" value="返回" onclick="javascript:history.back()">
</body>
</html>