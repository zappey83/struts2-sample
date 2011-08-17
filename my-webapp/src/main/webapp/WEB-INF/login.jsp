<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
<s:actionerror/>
<s:form action="Login">
	<s:textfield label="ユーザID" name="userId"></s:textfield>
	<s:textfield label="パスワード" name="password"></s:textfield>
	<s:submit value="ログイン"></s:submit>
</s:form>
</body>
</html>