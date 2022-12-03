<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: moonsangjun--%>
<%--  Date: 2022/12/03--%>
<%--  Time: 8:05 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form:form commandName="boardVo" method="POST" action="../editok">--%>
<%--    <form:hidden path="seq"/>--%>
<%--    <table id="edit">--%>
<%--        <tr><td>소속</td><td><form:input path="purpose"/></td></tr>--%>
<%--        <tr><td>이름</td><td><form:input path = 'nickname'/></td></tr>--%>
<%--        <tr><td>마감날짜</td><td><form:input path = 'duedate'/></td></tr>--%>
<%--        <tr><td>모집 인원</td><td><form:input path = 'personnel'/></td></tr>--%>
<%--        <tr><td>지원서 링크</td><td><form:input path = 'apply'/></td></tr>--%>
<%--        <tr><td>소개</td><td><form:input path = 'introduce'/></td></tr>--%>
<%--        <tr><td>문의</td><td><form:input path= 'inquire'/></td></tr>--%>
<%--        <tr><td>담당자</td><td><form:input path = 'manager'/></td></tr>--%>
<%--        <tr><td>지원 자격</td><td><form:input path = 'qualifications'/></td></tr>--%>
<%--        <tr><td>면접 날짜</td><td><form:input path = 'interview'/></td></tr>--%>
<%--        <tr><td>포스터</td><td><form:input path = 'image'/></td></tr>--%>
<%--    </table>--%>
<%--    <input type="submit" value="수정하기"/>--%>
<%--    <input type="button" value="취소하기 " onclick="history"/>--%>
<%--</form:form>--%>
<%--</body>--%>
<%--</html>--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<body>
<h1>Edit Form</h1>

<form:form modelAttribute="u" method="POST" action="../editok">
    <form:hidden path="seq"/>
    <table id="edit">
        <tr><td>Category:</td><td><form:input path="category" /></td></tr>
        <tr><td>Title:</td><td><form:input path="title" /></td></tr>
        <tr><td>Writer:</td><td><form:input path="writer" /></td></tr>
        <tr><td>Content:</td><td><form:textarea cols="50" rows="5" path="content" /></td></tr>
    </table>
    <input type="submit" value="Edit"/>
    <input type="button" value="cancel" onclick="history.back()">
</form:form>

</body>
</html>