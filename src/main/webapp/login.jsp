<%--
  Created by IntelliJ IDEA.
  User: 12271
  Date: 2020/1/30
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/img/logo.png">
    <script src="js/jquery-3.4.1.js"></script>
    <script src="js/login.js"></script>
    <link rel="stylesheet" type="text/css" href="css/login.css">

    <title>音乐后台管理界面-首页</title>
</head>
<body>

<div class="contain">
    <div class="logintop">
    </div>

    <div class="loginbody">
        <div class="logindiv">
            <form class="loginform" action="${pageContext.request.contextPath}/login.do" method="post">
                <ul>
                    <li>
                        <input type="text" class="loginuser" id="username" name="username" placeholder="请输入用户名"/>
                    </li>
                    <li>
                        <input type="password" class="loginpwd" id="password" name="password" placeholder="请输入密码"/>
                    </li>
                    <li>
                        <input type="submit" class="loginbtn" value="登录" id="loginbtn"/>
                    </li>
                </ul>
            </form>
        </div>
    </div>

    <div class="loginbottom">
        Copyright by Lin
    </div>

</div>
</body>
</html>
