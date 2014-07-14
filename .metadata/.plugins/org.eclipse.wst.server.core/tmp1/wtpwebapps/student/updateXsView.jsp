<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body bgcolor="#FFFFFF">
<s:set name="xs" value="#request.xsInfo"></s:set>
<s:form action="updateXs.action" method="post" enctype="multipart/formdata">
<table border="0" cellspacing="1" cellpadding="8" width="500">
<tr>
<td width="80">学号：</td><td><input type="text" name="xs.xh" 
value="<s:property value="#xs.xh"/>" readonly/></td>
</tr>
<tr>
<td width="80">姓名：</td><td><input type="text" name="xs.xm" 
value="<s:property value="#xs.xm"/>"/></td>
</tr>
<tr>
<tr>
<td width="80"><s:radio list="#{1:'男',0:'女'}" value="#xs.xb"
label="性别" name="xs.xb"></s:radio></td>
</tr>
<tr>
<td width="80">专业：</td>
<td>
<select name="xs.zyb.id">
<s:iterator value="#request.zys" id="zy">
<option value="<s:property value="#zy.id"/>">
<s:property value="#zy.zym"/>
</option>
</s:iterator>

</select>
</td>
</tr>
<tr>
<td width="80">出生时间：</td><td><input type="text" name="xs.cssj" 
format="yyyy-MM-dd" class="Wdate" onclick="WdatePicker()"/></td>
</tr>
<tr>
<td width="80">总学分：</td><td><input type="text" name="xs.zxf" 
value="<s:property value="#xs.zxh"/>" /></td>
</tr>
<tr>
<td width="80">备注：</td><td><input type="text" name="xs.bz" 
value="<s:property value="#xs.bz"/>" /></td>
</tr>
</table>
<input type="submit" value="提交">
<input type="button" value="返回" onclick="javascript:history.back();"/>
</s:form>
<script type="text/javascript">
  document.getElementById("xs.zyb.id").value=<s:property value="#xs.zyb.id"/>
</script>

</body>
</html>