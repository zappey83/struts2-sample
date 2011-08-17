<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認</title>
</head>
<body>
名前:<s:property value="name" /><br>
メールアドレス：<s:property value="email"/><br>
年齢:<s:property value="age"/><br>
好きな果物：<s:property value="fruit"/><br>
</body>
</html>