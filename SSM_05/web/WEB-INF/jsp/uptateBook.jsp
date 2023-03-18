<%--
  Created by IntelliJ IDEA.
  User: 胡淞纯
  Date: 2023/3/15
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍 —— 输入书籍数据</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/uptateBook" method="post">
<%--        这里在前端的端口可以修改，如何让它无法修改呢--%>
        <div class="form-group">
            <input type="hidden" name="bookID" class="form-control" value="${udbook.bookID}" readonly>
        </div>
        <div class="form-group">
            <label>书名</label>
            <input type="text" name="bookName" class="form-control" value="${udbook.bookName}" required>
        </div>
        <div class="form-group">
            <label>数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${udbook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>detail</label>
            <input type="text" name="detail" class="form-control" value="${udbook.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>
</body>
</html>
