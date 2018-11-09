<%--
  Created by IntelliJ IDEA.
  User: jackiechan
  Date: 18-8-13
  Time: 下午12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
当前是支付页面,订单号是: ${oid} <br>请扫码支付
<img src="/payment/image"> <!--这个地址用于获取TestServlet 中存放到 session 中的图片,指向的是 ImageServlet-->
</body>
</html>
