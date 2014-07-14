<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>课程信息</title>

<link rel="stylesheet" type="text/css" href="../css/sinfo.css">

</head>

<body>
	<div id="studentinfo">
		<label id="si">课程信息</label>
		<table border="1px" bordercolor="green">
			<tr align="center" bgcolor="green">
				<td>课程号</td>
				<td>课程名</td>
				<td>学时</td>
				<td>学分</td>
				<td>开课学期</td>
				<td>详细信息</td>
				<td>操作</td>
				<td>操作</td>
			</tr>
			<s:iterator value="#request.list" id="cour">
				<tr align="center">
					<td><s:property value="#cour.cid" />
					</td>
					<td><s:property value="#cour.cname" />
					</td>
					<td><s:property value="#cour.hours" />
					</td>
					<td><s:property value="#cour.credit" /></td>
					<td><s:property value="#cour.term" /></td>
					<td><a
						href="showDetail?course.cid=<s:property value="#cour.cid" />"><img
							src="../images/detail.png" border="0">详细信息</a></td>
					<td><a
						href="updateCourseView?course.cid=<s:property value="#cour.cid" />"><img
							src="../images/update.png" border="0">修改</a></td>
					<td><a
						href="deleteCourse?course.cid=<s:property value="#cour.cid" />"
						onclick="if(!confirm('你确定删除该信息吗？')) return false;else return true;"><img
							src="../images/delete.png" border="0">删除</a></td>
				</tr>
			</s:iterator>
			<tr>
				<td align="right" colspan="8" height="20px"><s:set name="page"
						value="#request.page"></s:set> <!-- 如果有前一页就提交到前一页 的pageNow值--> <s:if
						test="#page.hasPre">
						<a
							href="showCourseView?pageNow=<s:property value="#page.pageNow-1"/>">&lt;&lt;上一页</a>
					</s:if> <!-- 如果没有前一页就提交到pageNow值 --> <s:else>
						<a href="showCourseView?pageNow=1">首页</a>
					</s:else> <!-- 如果没有就提交最后一页的pageNow值 --> <s:if test="#page.hasNext">
						<a
							href="showCourseView?pageNow=<s:property value="#page.pageNow+1"/>">下一页&gt;&gt;</a>
					</s:if> <!-- 如果没有就提交最后一页的pageNow值 --> <s:else>
						<a
							href="showCourseView?pageNow=<s:property value="#page.totalPage"/>">下一页&gt;&gt;</a>
					</s:else> <!-- 尾页始终提交到最后一页的pageNow值 --> <a
					href="showCourseView?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
