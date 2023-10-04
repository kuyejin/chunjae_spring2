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
    <title>hibernate Validator에서 유효성 검사 - check6.jsp</title>
</head>
<body>
<div class="container">
    <h2>hibernate Validator에서 유효성 검사</h2>
    <hr>

    <div>
        연변 : <input type="text" name="num" id="num" required><br>
        제목 : <input type="text" name="title" id="title" required><br>
        <input type="button" id="btn1" value="등록"/>
    </div>
    <script>
        $(document).ready(function (){
            $("#btn1").click(function (){
                var test = {"num" : $("num").val(), "title" : $(#title).val()};
                $.ajax({
                    type:"post",
                    url:"${path1}/json/insertForm",
                    data:test,
                    success:function (t){console.log("성공",t);},
                    error:function (err){console.log("실패",err);}
                });
            });
        });
    </script>
</div>
</body>
</html>
