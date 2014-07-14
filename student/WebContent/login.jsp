<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生成绩管理系统</title>
<script type="text/javascript" language="javascript">
window.onload=function(){
	   var verifyObj = document.getElementById("Verify");
     verifyObj.onclick=function(){
        this.src="SecurityCodeImageAction?timestamp="+new Date().getTime();
	    };
	}
    </script>
</head>
<body bgcolor="#FFFFFF">
<table width="700" align="center">
<tr>
<td>
<s:form action="login" method="post" validate="true">
<s:textfield name="dl.xh" label="用户名" size="20" />
<s:password name="dl.kl" label="密码" size="20" />
<s:radio list="#{1:'教师',0:'学生' }" value="dl.role" label="角色" name="dl.role"/>
<!-- <img src="Security/SecurityCodeImageAction" id="Verify"  style="cursor:hand;" alt="看不清，换一张"/>
<input type="text" name="securityCode"/> -->
<s:submit value="登录"/>
</s:form>
<!-- <form action="login">
用户名：<input type="text" name="dl.xh" size="20"><br>
密码：<input type="password" name="dl.kl" size="20"><br>
角色：<input type="radio" name="" value="1">学生<input type="radio" name="dl.role" value="0">教师<br>
验证码：<input type="text" name="Valcode"size="5">
  <img id="code" src="aa" height="17">
  <a href="#" onclick="checkcode()" style="Font-size:10">换一张</a><br>
<input type="submit" value="登录">
</form> -->
</td>
</tr>
</table>
</body>
</html>