<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>课程信息录入</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/course.css">

</head>

<body bgcolor="#999999">
	<div id="course">
		<form action="addCourse" method="post">
			<fieldset id="cc">
				<legend class="cir">课程信息录入&gt;&gt;</legend>
				<div id="ci">
					<label>课程号</label> <input type="text" name="course.cid">
				</div>
				<br>
				<div id="cn">
					<label>课程名</label> <input type="text" name="course.cname">
				</div>
				<br>
				<div id="cr">
					<label>学&nbsp;&nbsp;&nbsp;&nbsp;分</label> <input type="text" name="course.credit">
				</div>
				<br>
				<div id="ch">
					<label>学&nbsp;&nbsp;&nbsp;&nbsp;时</label> <input type="text" name="course.hours">
				</div>
				<br>
				<div id="ct">
					<label>开学学期</label> <select name="course.term">
						<option value="1">第一学期</option>
						<option value="2">第二学期</option>
						<option value="3">第三学期</option>
						<option value="4">第四学期</option>
						<option value="5">第五学期</option>
						<option value="6">第六学期</option>
						<option value="7">第七学期</option>
						<option value="8">第八学期</option>
					</select>
				</div>
				<br> <input type="submit" value="录入" class="submit"> <input
					type="reset" value="取消" class="reset">
			</fieldset>
		</form>
	</div>
</body>
</html>
