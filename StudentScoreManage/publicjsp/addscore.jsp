<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>学生成绩录入</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/score.css">
<script language="javascript" type="text/javascript"
	src="../jquery/jquery-1.8.3.js"></script>
<script language="javascript" type="text/javascript"
	src="../js/addScore.js"></script>
</head>

<body bgcolor="#999999">
	<div id="score">
		<form action="addScore" method="post">
			<fieldset id="cj">
				<legend class="ssi">请填写学生的成绩信息&gt;&gt;</legend>
				<div id="si">
					<label>学生学号</label> <select name="score.scoreId.sid">
						<s:iterator id="stu" value="#request.listOne">
							<option value="<s:property value="#stu.sid"/>">
								<s:property value="#stu.sid" />
							</option>
						</s:iterator>
					</select>
				</div>
				<br>
				<div id="cn">
					<label>课程名称</label> <select name="score.scoreId.cid">
						<s:iterator id="cour" value="#request.listTwo">
							<option value="<s:property value="#cour.cid"/>">
								<s:property value="#cour.cname" />
							</option>
						</s:iterator>
					</select>
				</div>
				<div id="ss">
					<label>学生成绩</label> <input type="text" name="score.score" id="msc">
					<span id="ssc">你输入的成绩无效</span>
				</div>
				<br> <br> <input type="submit" value="添加" class="submit">
				<input type="reset" value="取消" class="reset">
			</fieldset>
		</form>
	</div>
</body>
</html>
