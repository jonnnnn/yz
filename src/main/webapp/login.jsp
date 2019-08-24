<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2018/8/13
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div >

<form action="login" method="post" onsubmit="return tijiao()">
<input type="text" value="" name="userid" id="a" placeholder="用户名">
    <br>
<input type="password" value="" name="password" id="b" placeholder="密码">
    <input type="submit" value="登录">
</form>

</div>

<script>
function tijiao() {
    var a = document.getElementById("a").value;
    var b = document.getElementById("b").value;
    if(a == "" || b == ""){
        alert("请输入！！");
        return false;
    }else{
        return true;
    }
}

</script>
</body>
</html>
