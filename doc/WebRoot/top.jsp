<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript">
  function userCancel(){
	  if(window.confirm("您确认要注销？")){
		  window.parent.location="./DestroyServlet";
	  }
  }
  </script>
  </head>
  <body>
  <%
  String logtime=(String) session.getAttribute("logtime");
  String username=(String) session.getAttribute("username");
  %>
  <table width="100%">
 <tr>
 <td>登录名：<%=username %>&nbsp;登录时间:<%=logtime %>
 <button onClick="userCancel()">【注销】</button></td>
 </tr> 
  </table>
  </body>
</html>
 