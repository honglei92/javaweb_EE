<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE  HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
	<title>模板</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<style type="text/css">
	body { font-family:Verdana; font-size:14px; margin:0;}

#container {margin:0 auto;}
#header { height:100px; background-image: url('images/bg.jpg'); margin-bottom:5px;font-size:40px;font-weight:bold;color: #E6E8FA;font-family:"微软雅黑";text-align:center;}
#mainContent { height:500px; margin-bottom:5px;}
#sidebar { float:left; width:305px; height:500px; background:#9ff;font-size: 20px;font-family: "微软雅黑";}
#content { float:right; width:1035px; height:500px; background:#cff;}/*因为是固定宽度，采用左右浮动方法可有效避免ie 3像素bug*/
#footer { height:120px;text-align:center;}
#sidebar img{height:15px; }
#sidebar ul li{list-style:none;}
	</style>
	<style>
BODY {
 PADDING-BOTTOM: 0px; MARGIN: 0px; PADDING-LEFT: 0px; PADDING-RIGHT: 0px; PADDING-TOP: 0px
}

.container {
 WIDTH: 1035px; HEIGHT: 500px
}
.container A IMG {
 
}
.container IMG {
 BORDER-BOTTOM-STYLE: none; BORDER-RIGHT-STYLE: none; BORDER-TOP-STYLE: none; BORDER-LEFT-STYLE: none
}
.td_f A IMG {
 PADDING-BOTTOM: 0px; MARGIN: 0px; PADDING-LEFT: 0px; PADDING-RIGHT: 0px; PADDING-TOP: 0px
}
.zzjs {
 POSITION: absolute; WIDTH: 90px; FLOAT: right; TOP: 468px; LEFT: 470px
}
.zzjs LI {
 TEXT-ALIGN: center; LINE-HEIGHT: 15px; LIST-STYLE-TYPE: none; MARGIN: 1px; WIDTH: 15px; FONT-FAMILY: Arial; BACKGROUND: url(/img/flashbutton.gif) no-repeat -15px 0px; FLOAT: left; HEIGHT: 15px; COLOR: #86a2b8; FONT-SIZE: 12px; CURSOR: pointer
}
.zzjs LI.on {
 LINE-HEIGHT: 15px; WIDTH: 15px; BACKGROUND: url(/img/flashbutton.gif) no-repeat; HEIGHT: 15px; COLOR: #ffffff
}
.more {
 FLOAT: right
}
.more1 A {
 TEXT-ALIGN: left; LINE-HEIGHT: 25px; MARGIN: 0px 0px 0px 10px; COLOR: #3373a3
}
</style>

</head>
<body class="body">
	<div id="container">
  <div id="header">档案数字化管理系统</div>
  <div id="mainContent">
    <div id="sidebar">
    <%
  String logtime=(String) session.getAttribute("logtime");
  String username=(String) session.getAttribute("username");
  %>
    	<ul>
    	    <li>您好：<%=username %>&nbsp;登录时间:<%=logtime %></li>
    		<li><a href="caiji.jsp"><img src="images/saomiao.png">采集管理</a></li>
    		<li><a href="zhijian.jsp"><img src="images/zhijian.png">映像质检</a></li>
    		<li><a href="luru.jsp"><img src="images/luru.png">档案录入</a></li>
    		<li><a href="chaxun.jsp"><img src="images/chaxun.png">档案查询</a></li>
    		<li><a href="quanxian.jsp"><img src="images/quanxian.png">权限管理</a></li>
    		<li><a href="rizhi.jsp"><img src="images/rizhi.png">日志管理</a></li>
    		<li><a href="login.jsp"><img src="images/zhuxiao.png">注销</a></li>
    	</ul>
    </div>
    <div id="content">
    	<DIV id=idContainer2 class=container>
    	<form method="post" name="AddUserServlet" action="AddUserServlet">
  <table style="height=100%;width=100%" align="left">
  <tr><td>
  <table align="left" width="500" border="1">
  <tr><td align="left" colspan="2">新增用户信息</td></tr>
  <tr><td>用户名：</td><td><input type="text" name="username" style="width=100%" size="25"></td></tr>
  <tr><td>密&nbsp;码：</td><td><input type="password" name="userpass" style="width=100%" size="25"></td></tr>
  <tr><td>重复密码：</td><td><input type="password" name="repass" style="width=100%" size="25"></td></tr>
  <tr><td>用户类别：</td><td>&nbsp;<input type="radio" name="role" value="0" checked>普通用户&nbsp;
  <input type="radio" name="role" value="1">管理员</td></tr>
  </table>
  </td></tr>
  
  <tr><td colspan="2" align="center">
  <button type="reset" onClick="res()" style="width:20%">重置</button>&nbsp;
  <input type="submit" value="提交">
  </td></tr>
  </table>
  </form>
        </DIV>
    </div>
  </div>
  <div id="footer">
  	<hr/>
  	<table width="1340">
  		<tr><td>公司简介|联系方式|版权声明|问题报告|软件维护|使用帮助</td></tr>
  		<tr><td><img height="13" src="images/MailBox.png"/>联系邮箱：836612526@qq.com&nbsp;
  			<img src="images/calls.png" height="13"/>服务热线：028-84622622</td></tr>  
  		<tr><td>Copyright &copy; 2005-1013,CDU.EDU.ALLRights Reserved</td></tr>
  	</table>
  </div>
</div>
</body>
</html>