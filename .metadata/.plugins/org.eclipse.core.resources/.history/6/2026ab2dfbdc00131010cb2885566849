<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>学生信息录入</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/register.css">
<script type="text/javascript" src="../js/calendar.js"></script>
</head>

<body bgcolor="#999999">
	<div id="register">
		<fieldset id="re">
			<legend class="rsi">学生信息录入&gt;&gt;</legend>
			<form action="register" method="post" enctype="multipart/form-data">
			<s:set name="stu" value="#request.student"></s:set>
				<div id="si">
					<label>学生学号</label> <input type="text" name="student.sid">
				</div>
				<br>
				<div id="sn">
					<label>学生姓名</label> <input type="text" name="student.sname">
				</div>
				<br>
				<div id="ss">
					<label>学生性别</label> <input type="radio" name="student.sex"
						checked="checked" value="男"> <label>男</label> <input type="radio"
						name="student.sex" value="女"> <label>女</label>
				</div>
				<br>
				<div id="sm">
					<label>所在专业</label>
					<s:select name="student.majorInfo.zid" list="list" listKey="zid"
						listValue="zname" headerKey="0" headerValue="--请选择专业--"></s:select>
				</div>
				<br>
				<div id="sb">
					<label>出生日期</label> <input type="text" name="student.birthday"
						onclick="calendar()">
				</div>
				<br>
				<div id="sr">
					<label id="allCredit">总学分&nbsp;&nbsp;&nbsp;&nbsp;</label>
					<input type="text" class="in" name="student.allCredit">
				</div>
				<br>
				<div id="sr">
					<label id="remark">信息备注</label>
					<textarea rows="7" cols="20" class="in" name="student.remark">请输入备注信息</textarea>
					<img alt="" src="getImage?student.sid=<s:property value="#stu.sid"/>" width="90px" height="100px" border="1">
				</div>
				<br>
				<div id="sp">
					<label>学生照片</label> <s:file name="photo" accept="images/*" />
				</div>
				<br> <input type="submit" value="录入" class="submit"> <input
					type="reset" value="取消" class="reset">
			</form>
		</fieldset>
	</div>
</body>
</html>
