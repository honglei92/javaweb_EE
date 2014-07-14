<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>新闻信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/newsinfo.css">
</head>

<body bgcolor="#999999">
	<div id="news">
	   <div id="title">所有信息内容</div>
		<s:iterator id="newsinfo" value="#request.news">
			<ol>
				<li>
				<a href="showNews?newsInfo.nid=<s:property value="#newsinfo.nid"/>">
				<s:property value="#newsinfo.title"/>&nbsp;&nbsp;&nbsp;&nbsp;
				<s:date name="#newsinfo.date" format="yyyy-MM-dd"/>
				</a>
				</li>
			</ol>
		</s:iterator>
	</div>
</body>
</html>
