<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アンケート</title>
</head>
<body>
<s:actionerror/>
<s:form action="ResearchConfirm" validate="true">
	<s:textfield label="名前" name="name"></s:textfield>
	<s:textfield label="メールアドレス" name="email"></s:textfield>
	<s:textfield label="年齢" name="age"></s:textfield>
	<s:radio label="好きな果物" name="fruit" list="#{'1':'みかん','2':'りんご','3':'スイカ'}"></s:radio>
	<s:submit value="確認"></s:submit>
</s:form>
</body>
</html>