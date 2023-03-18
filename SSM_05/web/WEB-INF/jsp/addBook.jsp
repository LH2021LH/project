<%--
  Created by IntelliJ IDEA.
  User: 胡淞纯
  Date: 2023/3/15
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>添加书籍 —— 输入书籍数据</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/addBook" method="post">
        <div class="form-group">
            <label>书名</label>
            <input type="text" name="bookName" class="form-control" required>
        </div>
        <div class="form-group">
            <label>数量</label>
            <input type="text" name="bookCounts" class="form-control" required>
        </div>
        <div class="form-group">
            <label>detail</label>
            <input type="text" name="detail" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-default">提交</button>
    </form>
</div>

</body>
</html>
