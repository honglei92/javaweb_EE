<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript">
  function userCancel(){
	  if(window.confirm("��ȷ��Ҫע����")){
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
 <td>��¼����<%=username %>&nbsp;��¼ʱ��:<%=logtime %>
 <button onClick="userCancel()">��ע����</button></td>
 </tr> 
  </table>
  </body>
</html>
 