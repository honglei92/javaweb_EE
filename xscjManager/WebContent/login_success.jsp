<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书管理系统</title>
</head>
<body bgcolor="#D9DFAA">
<s:set name="xs" value="#request.xs"></s:set>
登录成功！欢迎使用！欢迎您：<s:property value="#xs.xh"/>
</body>
</html>