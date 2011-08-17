<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2テスト</title>
</head>
<body>
<div>
<s:if test="#session.user != null">
こんにちは、{#session.user.name}さん
</s:if>
<s:else>
<a href="Login.action">ログイン</a>してください
</s:else>
</div>
<div>
<a href="Hello.action">こんにちは</a>
<br />
<s:property value="replyMessage"/>
<a href="Research.action">アンケート</a>
</div>
</body>
</html>