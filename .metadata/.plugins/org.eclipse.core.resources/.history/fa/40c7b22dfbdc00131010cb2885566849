<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>

<title>成绩信息</title>

<link rel="stylesheet" type="text/css" href="../css/sinfo.css">

</head>

<body>
	<div id="studentinfo">
		<label id="si">学生成绩信息</label>
		<table border="1px" bordercolor="green">
			<tr align="center" bgcolor="green">
				<td>学号</td>
				<td>姓名</td>
				<td>课程名</td>
				<td>成绩</td>
				<td>学分</td>
				<td>删除</td>
			</tr>
			<s:iterator value="#request.list" id="score">
				<tr align="center">
					<td><a
						href="findScore?score.scoreId.sid=<s:property value="#score[0]"/>"><s:property
								value="#score[0]" /> </a>
					</td>
					<td><s:property value="#score[1]" />
					</td>
					<td><s:property value="#score[2]" />
					</td>
					<td><s:property value="#score[3]" /></td>
					<td><s:property value="#score[4]" /></td>
					<td><a
						href="deleteScore?score.scoreId.sid=<s:property value="#score[0]" />&score.scoreId.cid=<s:property value="#score[5]" />"
						onclick="if(!confirm('你确定删除该信息吗？')) return false;else return true;"><img
							src="../images/delete.png" border="0">删除</a></td>
				</tr>
			</s:iterator>
			<tr>
				<td align="right" colspan="8" height="20px"><s:set name="page"
						value="#request.page"></s:set> <!-- 如果有前一页就提交到前一页 的pageNow值--> <s:if
						test="#page.hasPre">
						<a
							href="showScoreView?pageNow=<s:property value="#page.pageNow-1"/>">&lt;&lt;上一页</a>
					</s:if> <!-- 如果没有前一页就提交到pageNow值 --> <s:else>
						<a href="showScoreView?pageNow=1">首页</a>
					</s:else> <!-- 如果没有就提交最后一页的pageNow值 --> <s:if test="#page.hasNext">
						<a
							href="showScoreView?pageNow=<s:property value="#page.pageNow+1"/>">下一页&gt;&gt;</a>
					</s:if> <!-- 如果没有就提交最后一页的pageNow值 --> <s:else>
						<a
							href="showScoreView?pageNow=<s:property value="#page.totalPage"/>">下一页&gt;&gt;</a>
					</s:else> <!-- 尾页始终提交到最后一页的pageNow值 --> <a
					href="showScoreView?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
