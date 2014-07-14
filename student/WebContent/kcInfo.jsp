<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body bgcolor="#FFFFFF">
<table border="1" cellspacing="1" cellpadding="8" width="700">
<tr align="center" bgcolor="#CAFF70">
<th>课程号</th><th>课程名</th><th>开学学期</th><th>学时</th><th>学分</th>
<!-- <th>详细信息</th><th>删除</th> -->
</tr>
<s:iterator value="#request.list" id="kc">
<tr>
<td><s:property value="#kc.kch"/></td>
<td><s:property value="#kc.kcm"/></td>
<td><s:property value="#kc.kxxq"/></td>
<td><s:date name="#kc.xs"/></td>
<td><s:property value="#kc.xf"/> </td>
<%-- <td><a href="findKc.action?Kc.xh=<s:property value="#Kc.kch"/>">详细信息</a> </td>
<td><a href="deleteXs.action?xs.xh=<s:property value="#xs.xh"/>"
onclick="if(!confirm('确定删除该信息吗？'))return false;else return true;">删除</a></td>
</tr> --%>
</s:iterator>

<s:set name="page" value="#request.page"></s:set>
<s:if test="#page.hasFirst">
<s:a href="kcInfo.action?pageNow=1">首页</s:a>
</s:if>
<s:if test="#page.hasPre">
<a href="kcInfo.action?pageNow=<s:property value='#page.pageNow-1'/>">上一页</a>
</s:if>
<s:if test="#page.hasNext">
<a href="kcInfo.action?pageNow=<s:property value='#page.pageNow+1'/>">下一页</a>
</s:if>
<s:if test="#page.hasLast">
<a href="kcInfo.action?pageNow=<s:property value='#page.totalPage'/>">尾页</a>
</s:if>
</table>
</body>
</html>