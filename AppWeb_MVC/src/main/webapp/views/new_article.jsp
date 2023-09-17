<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Article</title>
    </head>
    <body>
        <a href="principal">Return to home</a>
        <br><br>
        <h1>New article</h1>
        <tag:form action="post_article" method="POST"
                  modelAttribute="articleFrm">
            <h2>Title</h2>
            <tag:input path="title"/>
            <h2>Journal</h2>
            <c:forEach items="${listJournals}" var="journal">
                <label>
                    <input type="checkbox" name="journal" value="${journal.isbn}" />
                    <c:out value="${journal.title}" />
                </label><br/>
            </c:forEach>
            <h2>Status</h2>
            <tag:radiobutton path="status" value="ACP" label="Accepted" checked =
                    "checked"/>
            <tag:radiobutton path="status" value="REV" label="Review"/>
            <tag:radiobutton path="status" value="DES" label="Development"/>
            <tag:button>Submit</tag:button>
        </tag:form>
    </body>
</html>