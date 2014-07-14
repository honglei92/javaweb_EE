<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>课程详细信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/studentdetail.css">

</head>

<body bgcolor="#999999">
	<div id="register">
		<fieldset id="re">
			<legend class="rsi">课程详细信息</legend>
			<s:set name="kc" value="#request.course"></s:set>
			<div id="si">
				<label>课程号</label> &nbsp;&nbsp;
				<s:property value="#kc.cid" />
			</div>
			<br>
			<div id="sn">
				<label>课程名</label> &nbsp;&nbsp;
				<s:property value="#kc.cname" />
			</div>
			<br>
				<div id="sm">
					<label>总学时</label> &nbsp;&nbsp;
					<s:property value="#kc.hours" />
				</div>
				<br>
				<div id="sm">
					<label>总学分</label> &nbsp;&nbsp;
					<s:property value="#kc.credit" />
				</div>
				<br>
				<div id="sr">
					<label id="remark">开课学期</label>&nbsp;&nbsp;
				<s:property value="#kc.term" />
			</div>
		</fieldset>
	</div>
</body>
</html>
