<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>content_view.jsp</title>
</head>
<body>
	<h1>���� �Խ���</h1>
	<table width="800" cellpadding="0" cellspacing="0" border="1">
		<form action="modify.do" method="post">
			<tr>
				<td align="center" width="10%">�� ȣ</td>
				<td width="20%">${content_view.bid }</td>
				<td align="center" width="10%">������</td>
				<td><input type="text" name="btitle" value="${content_view.btitle }"></td>
			</tr>
			<tr>
				<td align="center">�۾���</td>
				<td>${content_view.bname }</td>
				<td align="center">��ȸ��</td>
				<td>${content_view.bhit }</td>
			</tr>
			<tr>
				<td align="center">����</td>
				<td colspan="3"><textarea cols="80" name="bcontent" rows="10">${content_view.bcontent }</textarea></td>
			</tr>
			<tr>
				<td><input align="center" type="submit" value="����"></td>
				<td colspan="3"><a href="list.do">�۸�Ϻ���</a>&nbsp;&nbsp;&nbsp;&nbsp;����&nbsp;&nbsp;&nbsp;&nbsp;�亯</td>
			</tr>
			
		</form>
	
	</table>
</body>
</html>