<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>学生成绩管理系统</title>


<link rel="stylesheet" type="text/css" href="../css/main.css">

</head>

<body bgcolor="white">
	<div id="head">
		<jsp:include page="../publicjsp/head.jsp" />
	</div>
	<div id="leftandright">
		<div id="left">
			<jsp:include page="../publicjsp/left.jsp" />
		</div>
		<div id="right">
			<jsp:include page="../publicjsp/courseinfo.jsp" />
		</div>
	</div>
	<div id="foot">
		<jsp:include page="../publicjsp/bottom.jsp" />
	</div>
</body>
</html>
