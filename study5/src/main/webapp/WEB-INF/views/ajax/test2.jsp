<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path1" value="${pageContext.servletContext.contextPath }"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajax Test2</title>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<ul>
    <li><a href="${path1}/ajax/">Home</a></li>
</ul>
<button id="btn2">POST 전송</button>
<script>
    $(document).ready(function () {
        var obj = { "msg" : "메시지"};
        let fn1 = () => $.ajax({
            type: "post",
            url: "${path1}/ajax/test2pro",
            success: function (res) {
                console.log("성공", res);
            },
            error: function (err) {
                console.log("실패", err)
            }
        });
        $("#btn2").on("click",fn1());
    });
</script>
</body>
</html>