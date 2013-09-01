<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body bgcolor="#D9DFAA">
<h3>该宝贝信息如下：</h3>
<s:set name="xs" value="#request.xs"></s:set>
<s:form action="xsInfo.action" method="post">
<table border="1" cellpadding="5">
<tr>
<td>学号：</td>
<td width="100"><s:property value="#xs.xh"/></td>
<td rowspan="7"> <img src="<s:property value="#xs.zp"/>"></td>
</tr>
<tr>
<td>姓名：</td>
<td width="100"><s:property value="#xs.xm"/></td>
</tr>
<tr>
<td>性别：</td>
<td width="100">
<s:if test="#xs.xb==1">男</s:if>
<s:else>女</s:else>
</td>
</tr>
<tr>
<td>专业:</td>
<td width="100"><s:property value="#xs.zyb.zym"/></td>
</tr>
<tr>
<td>出生时间:</td>
<td width="100"><s:date name="#xs.cssj" format="yyyy-MM-dd"/></td>
</tr>
<tr>
<td>总学分:</td>
<td width="100"><s:property value="#xs.zxf"/> </td>
</tr>
<tr>
<td>备注</td>
<td width="100"><s:property value="#xs.bz"/> </td>
</tr>
</table>
<input type="submit" value="返回">
</s:form>
</body>
</html>