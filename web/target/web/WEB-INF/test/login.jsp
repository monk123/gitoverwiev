<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
    <html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>signin</title>
        <link href="../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="../../resources/bootstrap/js/jquery-3.1.1.min.js">
        <link rel="stylesheet" href="../../resources/bootstrap/js/bootstrap.min.js">
        <link rel="stylesheet" href="../../resources/ie10/ie10-viewport-bug-workaround.css">
        <link rel="stylesheet" href="../../resources/ie10/ie10-viewport-bug-workaround.js">
        <link rel="stylesheet" href="../../resources/css/index.css">
        <link href="../../resources/css/shop-homepage.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
    <div class="container">
        <s:url value="/j_spring_security_check" var="loginUrl"/>
        <form class="form-signin" method="post" action="${loginUrl}">
            <h2 class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" name="j_username" class="form-control" placeholder="Email address" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" name="j_password" id="inputPassword" class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label for="remember_me" class="inline">
                    <input id="remember_me" name="_spring_security_remember_me"
                           type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button href="<c:url value="/index"/>" class="btn btn-lg btn-primary btn-block" type="submit">Sing In</button>
            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}"><jsp:text/>
        </form>
    </div>
    </body>
    </html>