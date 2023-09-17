<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Journal</title>
</head>
<body>
<a href="principal">Return to home</a>
<br><br>
<h1>New article</h1>
<tag:form action="post_journal" method="POST"
          modelAttribute="journalFrm">
    <h2>Journal title </h2>
    <tag:input path="title"/>
    <h2>ISBN</h2>
    <tag:input path="isbn"/>
    <h2>Type</h2>
    <tag:radiobutton path="type" value="IDX" label="Indexed" checked =
            "checked"/>
    <tag:radiobutton path="type" value="NOIDX" label="Non-Indexed"/>
    <tag:button>Submit</tag:button>
</tag:form>
</body>
</html>