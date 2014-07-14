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
		<form action="updateCourse" method="post">
			<fieldset id="re">
				<legend class="rsi">课程信息修改&gt;&gt;</legend>
				<s:set name="cour" value="#request.course"></s:set>
				<div id="si">
					<label>课程号</label> <input type="text" name="course.cid"
						value="<s:property value="#cour.cid"/>" readonly="readonly">
				</div>
				<br>
				<div id="sn">
					<label>课程名</label> <input type="text" name="course.cname"
						value="<s:property value="#cour.cname"/>">
				</div>
				<br>
				<div id="ss">
					<label>总学时</label> <input type="text" name="course.hours"
						value="<s:property value="#cour.hours"/>">
				</div>
				<br>
				<div id="sb">
					<label>总学分</label> <input type="text" name="course.credit"
						value="<s:property value="#cour.credit"/>">
				</div>
				<br>
				<div id="sm">
					<label>开课学期</label> <select name="course.term">
						<option>
							<s:property value="#cour.term" />
						</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
					</select>
				</div>
				<br> <br> <input type="submit" value="修改" class="submit">
				<input type="reset" value="取消" class="reset">
			</fieldset>
		</form>
	</div>
</body>
</html>
