<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>学生详细信息</title>

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
			<legend class="rsi">学生详细信息&gt;&gt;</legend>
			<s:set name="st" value="#request.student"></s:set>
			<div id="si">
				<label>学生学号</label> &nbsp;&nbsp;
				<s:property value="#st.sid" />
			</div>
			<br>
			<div id="sn">
				<label>学生姓名</label> &nbsp;&nbsp;
				<s:property value="#st.sname" />
			</div>
			<br>
			<div id="detail">
				<div id="ss">
					<label>学生性别</label> &nbsp;&nbsp;
					<s:property value="#st.sex" />
				</div>
				<br>
				<div id="sm">
					<label>专业名称</label> &nbsp;&nbsp;
					<s:property value="#st.majorInfo.zname" />
				</div>
				<br>
				<div id="sm">
					<label>总学分</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<s:property value="#st.allCredit" />
				</div>
				<br>
				<div id="sb">
					<label>出生日期</label> &nbsp;&nbsp;
					<s:property value="#st.birthday" />
				</div>
				<br>
				<div id="sr">
					<label id="remark">信息备注</label> <label class="remarkinfo">&nbsp;&nbsp;<s:property
							value="#st.remark" />
					</label>
				</div>
			</div>
			<div id="sp">
				<img alt="photo" src="getImage?st.sid=<s:property value="st.sid"/>"
					width="180px" height="200px" border="1">
			</div>
			<br> <br>
			<br>
		</fieldset>
	</div>
</body>
</html>
