<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE  HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
	<title>ģ��</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<style type="text/css">
	body { font-family:Verdana; font-size:14px; margin:0;}

#container {margin:0 auto;}
#header { height:100px; background-image: url('images/bg.jpg'); margin-bottom:5px;font-size:40px;font-weight:bold;color: #E6E8FA;font-family:"΢���ź�";text-align:center;}
#mainContent { height:500px; margin-bottom:5px;}
#sidebar { float:left; width:305px; height:500px; background:#9ff;font-size: 20px;font-family: "΢���ź�";}
#content { float:right; width:1035px; height:500px; background:#cff;}/*��Ϊ�ǹ̶���ȣ��������Ҹ�����������Ч����ie 3����bug*/
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
  <div id="header">�������ֻ�����ϵͳ</div>
  <div id="mainContent">
    <div id="sidebar">
    <%
  String logtime=(String) session.getAttribute("logtime");
  String username=(String) session.getAttribute("username");
  %>
    	<ul>
    	    <li>���ã�<%=username %>&nbsp;��¼ʱ��:<%=logtime %></li>
    		<li><a href="caiji.jsp"><img src="images/saomiao.png">�ɼ�����</a></li>
    		<li><a href="zhijian.jsp"><img src="images/zhijian.png">ӳ���ʼ�</a></li>
    		<li><a href="luru.jsp"><img src="images/luru.png">����¼��</a></li>
    		<li><a href="chaxun.jsp"><img src="images/chaxun.png">������ѯ</a></li>
    		<li><a href="quanxian.jsp"><img src="images/quanxian.png">Ȩ�޹���</a></li>
    		<li><a href="rizhi.jsp"><img src="images/rizhi.png">��־����</a></li>
    		<li><a href="login.html"><img src="images/zhuxiao.png">ע��</a></li>
    	</ul>
    </div>
    <div id="content">
    	<DIV id=idContainer2 class=container>
    	<s:form action="upload" method="post" enctype="multipart/form-data">
   <s:file name="upload" label="�ϴ����ļ�"></s:file>
   <s:submit value="�ϴ�"></s:submit>
   </s:form>
        </DIV>
    </div>
  </div>
  <div id="footer">
  	<hr/>
  	<table width="1340">
  		<tr><td>��˾���|��ϵ��ʽ|��Ȩ����|���ⱨ��|���ά��|ʹ�ð���</td></tr>
  		<tr><td><img height="13" src="images/MailBox.png"/>��ϵ���䣺836612526@qq.com&nbsp;
  			<img src="images/calls.png" height="13"/>�������ߣ�028-84622622</td></tr>  
  		<tr><td>Copyright &copy; 2005-1013,CDU.EDU.ALLRights Reserved</td></tr>
  	</table>
  </div>
</div>
</body>
</html>