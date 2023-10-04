<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path1" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajax home</title>
</head>
<body>
    <ul>
        <li><a href="${path1}/ajax/test1">01_GET 전송</a> </li>
        <li><a href="${path1}/ajax/test2">02_POST 전송</a> </li>
        <li><a href="${path1}/ajax/test3">03_GET + Parameter 전송</a> </li>
        <li><a href="${path1}/ajax/test4">04_POST + Parameter 전송</a> </li>
        <li><a href="${path1}/ajax/test5">05_GET + @ModelAttribute + Object 전송</a> </li>
        <li><a href="${path1}/ajax/test6">06_POST + @ModelAttribute + Object 전송</a> </li>
        <li><a href="${path1}/ajax/test7">07_POST + @RequestBody + Object 전송</a> </li>
        <li><a href="${path1}/ajax/test8">08_POST + Parameter + List 전송</a> </li>
        <li><a href="${path1}/ajax/test9">09_POST + Parameter + ResponseEntity Object 전송</a> </li>
        <li><a href="${path1}/ajax/test10">10_POST + Parameter + ResponseEntity List 전송</a> </li>
    </ul>

</body>
</html>