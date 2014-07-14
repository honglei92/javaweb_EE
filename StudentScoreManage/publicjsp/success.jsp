<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>登录成功</title>

<link rel="stylesheet" type="text/css" href="../css/success.css">

</head>
<body bgcolor="white">
	<div id="info">
		<div id="su">
			<label id="welcome">欢迎你:${session.sid }
				&nbsp;&nbsp;当前登录时间：${session.time } &nbsp;<a href="logout.action">【注销】</a>
			</label>
		</div>
		<div id="t1">
			<label class="title">学校开课信息</label> <a href="showAllNews" class="more">more&gt;&gt;</a>
			<ol>
				<s:iterator value="#request.news" id="xw" begin="0" step="1" end="5">
					<li><s:if test="#xw.title.length()>9">
							<a href="showNews?newsInfo.nid=<s:property value="#xw.nid"/>">
								<s:property value="#xw.title.substring(0,9)+'......'" /> </a>
						</s:if> <s:else>
							<a href="showNews?newsInfo.nid=<s:property value="#xw.nid"/>">
								<s:property value="#xw.title" /> </a>
						</s:else> &nbsp;&nbsp;&nbsp; <s:date name="#xw.date" format="yy-MM-dd" />
					</li>
				</s:iterator>
			</ol>
		</div>
		<div id="t2">
			<label class="title">学校公告信息</label> <a href="showAllNews" class="more">more&gt;&gt;</a>
			<ol>
				<s:iterator value="#request.news" id="xw" begin="0" step="1" end="5">
					<li><a
						href="showNews?newsInfo.nid=<s:property value="#xw.nid"/>"> <s:if
								test="#xw.title.length()>12">
								<s:property value="#xw.title.substring(0,10)+'......'" />
							</s:if> </a> <s:else>
							<s:property value="#xw.title" />
						</s:else> &nbsp;&nbsp;&nbsp; <s:date name="#xw.date" format="yy-MM-dd" />
					</li>
				</s:iterator>
			</ol>
		</div>
		<div id="t3">
			<label class="title">国外名校信息</label> <a href="showAllNews" class="more">more&gt;&gt;</a>
			<ol>
				<s:iterator value="#request.news" id="xw" begin="0" step="1" end="5">
					<li><a
						href="showNews?newsInfo.nid=<s:property value="#xw.nid"/>"> <s:if
								test="#xw.title.length()>12">
								<s:property value="#xw.title.substring(0,10)+'......'" />
							</s:if> </a> <s:else>
							<s:property value="#xw.title" />
						</s:else> &nbsp;&nbsp;&nbsp; <s:date name="#xw.date" format="yy-MM-dd" />
					</li>
				</s:iterator>
			</ol>
		</div>
		<div id="t4">
			<label class="title">学校论坛信息</label> <a href="showAllNews" class="more">more&gt;&gt;</a>
			<ol>
				<s:iterator value="#request.news" id="xw" begin="0" step="1" end="5">
					<li><a
						href="showNews?newsInfo.nid=<s:property value="#xw.nid"/>"> <s:if
								test="#xw.title.length()>12">
								<s:property value="#xw.title.substring(0,10)+'......'" />
							</s:if> </a> <s:else>
							<s:property value="#xw.title" />
						</s:else> &nbsp;&nbsp;&nbsp; <s:date name="#xw.date" format="yy-MM-dd" />
					</li>
				</s:iterator>
			</ol>
		</div>
	</div>
</body>
</html>
