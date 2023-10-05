<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <!-- 헤드 부분 인클루드 -->
    <jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>
<header id="header">
    <!-- 헤더 부분 인클루드 -->
    <jsp:include page="../include/hd.jsp"></jsp:include>
</header>

    <div class="hero is-fullheight">
        <div class="hero-body is-justify-content-center is-align-items-center">

            <form action="${path1}/user/loginpro.do" id="login_frm" class="frm" method="post">
                <div class="columns is-flex is-flex-direction-column box">
                    <div class="column">
                        <label for="id">ID</label>
                        <input class="input is-primary" id="id" name="id" type="text" placeholder="아이디 입력">
                    </div>
                    <div class="column">
                        <label for="pw">Password</label>
                        <input class="input is-primary" id="pw" name="pw" type="password" placeholder="비밀번호 입력">
                        <a href="forget.html" class="is-size-7 has-text-primary">forget password?</a>
                    </div>
                    <div class="column">
                        <button class="button is-primary is-fullwidth" type="submit">Login</button>
                    </div>
                    <div class="has-text-centered">
                        <p class="is-size-7"> Don't have an account? <a href="#" class="has-text-primary">Sign up</a>
                        </p>
                    </div>
                </div>
            </form>

        </div>
    </div>


</div>
<footer id="footer" class="footer-nav row expanded collapse">
    <!-- 푸터 부분 인클루드 -->
    <jsp:include page="../include/ft.jsp"></jsp:include>
</footer>

</body>
</html>