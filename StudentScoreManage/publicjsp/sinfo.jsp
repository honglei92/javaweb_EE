<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>学生信息</title>

<link rel="stylesheet" type="text/css" href="../css/sinfo.css">

</head>

<body>
	<div id="studentinfo">
		<label id="si">学生基本信息</label>
		<table border="1px" bordercolor="green">
			<tr align="center" bgcolor="green">
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>专业信息</td>
				<td>出生日期</td>
				<td>详细信息</td>
				<td>修改</td>
				<td>删除</td>
			</tr>
			<s:iterator value="#request.list" id="student">
				<tr align="center">
					<td><s:property value="#student.sid" />
					</td>
					<td><s:property value="#student.sname" />
					</td>
					<td><s:property value="#student.sex" />
					</td>
					<td><s:property value="#student.majorInfo.zname" /></td>
					<td><s:property value="#student.birthday" /></td>
					<td><a
						href="showDetailView?student.sid=<s:property value="#student.sid" />"><img
							src="../images/detail.png" border="0">详细信息</a></td>
					<td><a
						href="updateView?student.sid=<s:property value="#student.sid" />"><img
							src="../images/update.png" border="0">修改</a></td>
					<td><a
						href="delete?student.sid=<s:property value="#student.sid" />"
						onclick="if(!confirm('你确定删除该信息吗？')) return false;else return true;"><img
							src="../images/delete.png" border="0">删除</a></td>
				</tr>
			</s:iterator>
			<tr>
				<td align="right" colspan="8" height="20px"><s:set name="page"
						value="#request.page"></s:set> <!-- 如果有前一页就提交到前一页 的pageNow值--> <s:if
						test="#page.hasPre">
						<a
							href="showStudent?pageNow=<s:property value="#page.pageNow-1"/>">&lt;&lt;上一页</a>
					</s:if> <!-- 如果没有前一页就提交到pageNow值 --> <s:else>
						<a href="showStudent?pageNow=1">首页</a>
					</s:else> <!-- 如果没有就提交最后一页的pageNow值 --> <s:if test="#page.hasNext">
						<a
							href="showStudent?pageNow=<s:property value="#page.pageNow+1"/>">下一页&gt;&gt;</a>
					</s:if> <!-- 如果没有就提交最后一页的pageNow值 --> <s:else>
						<a
							href="showStudent?pageNow=<s:property value="#page.totalPage"/>">下一页&gt;&gt;</a>
					</s:else> <!-- 尾页始终提交到最后一页的pageNow值 --> <a
					href="showStudent?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</td>
			</tr>
		</table>

	</div>
</body>
</html>
