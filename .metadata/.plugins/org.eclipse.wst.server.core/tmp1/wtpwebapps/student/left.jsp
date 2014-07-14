<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生成绩管理系统</title>
<style type="text/css">
a:link,a:visited{
 text-decoration:none;  /*超链接无下划线*/
}
a:hover{
 text-decoration:underline;  /*鼠标放上去有下划线*/
}
p{color: red;font-family: 微软雅黑;}
welome{font-family: 微软雅黑;color: #FFFFFF;font-weight: bold;padding-right: 50px;}
</style>
</head>
<body bgcolor="#CCFF99" link="#080808" vlink="#080808">
<s:set name="user" value="#session.user"></s:set>
<s:if test="#user==null">
<table cellpadding="0" cellspacing="0">
<tr><td><p>学生管理<hr/></p></td></tr>
<tr><td><a href="addXsView.action" target="right">学生信息录入</a></td></tr>
<tr><td><a href="xsInfo.action" target="right">学生信息查询</a></td></tr>
<tr><td><p>课程管理<hr></p></td></tr>
<tr><td><a href="addKcView.action" target="right">课程信息录入</a></td></tr>
<tr><td><a href="kcInfo.action" target="right">课程信息查询</a></td></tr>
<tr><td><p>成绩管理<hr></p></td></tr>
<tr><td id="teacher"><a href="addXscjView.action" target="right">成绩信息录入</a></td></tr>
<tr><td id="teacher"><a href="xscjInfo.action" target="right">学生成绩管理</a></td></tr>
</table>
</s:if>
<s:elseif test="(#user!=null)&&(#user.role==0)">
<table cellpadding="0" cellspacing="0">
<tr><td>欢迎您：${user.xh}&nbsp;&nbsp;
<a href="logout.action" target="main">退出</a></td></tr> 
<tr><td><p>学生管理<hr/><p></td></tr>
<tr><td><a href="addXsView.action" target="right">学生信息录入</a></td></tr>
<tr><td><a href="xsInfo.action" target="right">学生信息查询</a></td></tr>
</table>
</s:elseif>
<s:elseif test="(#user!=null)&&(#user.role==1)">
<table cellpadding="0" cellspacing="0">
<tr><td>欢迎您：${user.xh}&nbsp;&nbsp;
<a href="logout.action" target="main">退出</a></td></tr> 
<tr><td><p>课程管理<hr></p></td></tr>
<tr><td><a href="addKcView.action" target="right">课程信息录入</a></td></tr>
<tr><td><a href="kcInfo.action" target="right">课程信息查询</a></td></tr>
<tr><td><p>成绩管理<hr/><p></td></tr>
<tr><td id="teacher"><a href="addXscjView.action" target="right">成绩信息录入</a></td></tr>
<tr><td id="teacher"><a href="xscjInfo.action" target="right">学生成绩管理</a></td></tr>
</table>
</s:elseif>
</body>
</html>