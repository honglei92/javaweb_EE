<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>My JSP 'registerinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/registerinfo.css">

</head>

<body bgcolor="white">
	<div id="info">
	<a href="main.jsp">&lt;&lt;返回</a>
		<fieldset id="reginfo">
			<legend id="sir">学生信息注册</legend>
			<form action="registerInfo" method="post" enctype="multipart/form-data">
				<div id="si">
					<label>学生学号</label> <input type="text" name="reg.sid">
				</div>
				<br>
				<div id="sn">
					<label>学生姓名</label> <input type="text" name="sname">
				</div>
				<br>
				<div id="ss">
					<label>学生性别</label> <input type="radio" name="sex"
						checked="checked"> <label>男</label> <input type="radio"
						name="sex"> <label>女</label>
				</div>
				<br>
				<div id="sb">
					<label>出生日期</label> <input type="text" name="birthday">
				</div>
				<br>
				<div id="sz">
					<label>所属专业</label> <input type="text" name="major">
				</div>
				<br>
				<div id="sr">
					<label id="remark">信息备注</label>
					<textarea rows="12" cols="24" class="in" name="remark">请输入备注信息</textarea>
					<img alt="" src="../images/logo.jpg" width="140px" height="190px" border="1">
				</div>
				<br>
				<div id="sp">
					<label>学生照片</label> <input type="file" name="photo">
				</div>
				<br> <br> <input type="submit" value="注册" class="submit">
				<input type="reset" value="取消" class="reset">
			</form>
		</fieldset>
	</div>
</body>
</html>
