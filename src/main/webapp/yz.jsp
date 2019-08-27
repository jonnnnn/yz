<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2018/8/13
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>提示：在删除前请先退出ERP销售开票单界面！</h2>
<table cellspacing="0" border="0" cellpadding="1" width="80%">
<tr>
    <td>公司</td>
    <td>创建时间</td>
    <td>最后修改时间</td>
    <td>单据编号</td>
    <td>商品编码</td>
    <td>商品名称</td>
    <td>数量</td>
    <td>批号</td>
    <td>备注</td>
    <td>开票员</td>
    <td>开票员ID</td>
    <td>仓库</td>
    <td>操作</td>
</tr>

<c:forEach items="${yz}" var="yz">
    <tr>
       <%-- <td>${yz.pk}</td>--%>
           <td>${yz.branchid}</td>
           <td>${yz.createtime}</td>
           <td>${yz.lastmodifytime}</td>
           <td>${yz.billid}</td>
           <td style="color:red ">${yz.prodno}</td>
           <td style="color: red">${yz.prodname}</td>
           <td style="color: red">${yz.quantity}</td>
           <td>${yz.lotno}</td>
           <td>${yz.note}</td>
           <td>${yz.staffname}</td>
           <td>${yz.opid}</td>
           <td>${yz.storname}</td>
           <td td style="vertical-align: middle;display: table-cell">
           <form action="detYz" method="post" onsubmit="return tijioa()">
               <input type="submit" value="删除">
               <input type="hidden" value="${yz.pk}" name="pk">
           </form>
           </td>
    </tr>
</c:forEach>
</table>

<br>
<br>
<br>
&nbsp&nbsp&nbsp
<a href="goYzList">刷新</a>
<br>
<br>
&nbsp&nbsp&nbsp
<a href="login.jsp">返回</a>
<br>
<br>
<%--&nbsp&nbsp&nbsp
<a href="/loginOut">注销</a>--%>
<script>
function tijioa() {
    var del = confirm("确认删除？")
    if(del){
        return true;
    }else {
        return false;
    }
}

</script>


</body>
</html>
