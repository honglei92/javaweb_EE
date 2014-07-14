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
		<form action="update" method="post" enctype="multipart/form-data">
			<fieldset id="re">
				<legend class="rsi">学生信息修改&gt;&gt;</legend>
				<s:set name="stu" value="#request.stu"></s:set>
				<div id="si">
					<label>学生学号</label> <input type="text" name="student.sid"
						value="<s:property value="#stu.sid"/>" readonly="readonly">
				</div>
				<br>
				<div id="sn">
					<label>学生姓名</label> <input type="text" name="student.sname"
						value="<s:property value="#stu.sname"/>">
				</div>
				<br>
				<div id="ss">
					<label>学生性别</label> <input type="radio" name="student.sex"
						value="<s:property value="#stu.sex"/>" checked="checked">
					<label>男</label> <input type="radio" name="student.sex"
						value="<s:property value="#stu.sex"/>"> <label>女</label>
				</div>
				<br>
				<div id="sm">
					<label>所在专业</label> <select name="student.majorInfo.zid">
						<s:iterator value="#request.major" id="zy">
							<option value="<s:property value="#zy.zid"/>">
								<s:property value="#zy.zname" />
							</option>
						</s:iterator>
					</select>
				</div>
				<br>
				<div id="sb">
					<label>出生日期</label> <input type="text" name="student.birthday"
						value="<s:property value="#stu.birthday"/>" onclick="calendar()">
				</div>
				<br>
				<div id="sr">
					<label id="remark">总学分&nbsp;&nbsp;&nbsp;&nbsp;</label> <input type="text"
						name="student.allCredit" value="<s:property value="#stu.allCredit"/>" />
				</div>
				<br>
				<div id="sr">
					<label id="remark">信息备注</label> <input type="text"
						name="student.remark" value="<s:property value="#stu.remark"/>" />
				</div>
				<br>
				<div id="sp">
					<label>学生照片</label> <input type="file" name="photo">
				</div>
				<br> <input type="submit" value="录入" class="submit"> <input
					type="reset" value="取消" class="reset">
			</fieldset>
		</form>
	</div>
</body>
</html>
