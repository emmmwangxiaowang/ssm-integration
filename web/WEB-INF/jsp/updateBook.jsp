<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/19 0019
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="control-group">
            <label>书籍名称:</label>

            <input type="text" name="bookName" class="form-control" value="${queryBook.bookName}" required>

        </div>
        <div class="control-group">
            <label>书籍数量:</label>

            <input type="text" name="bookCounts" class="form-control" value="${queryBook.bookCounts}" required>

        </div>
        <div class="control-group">
            <label>书籍描述:</label>

            <input type="text" name="detail" class="form-control" value="${queryBook.detail}" required>

        </div>

        <%--id不可更改,所以用隐藏域--%>
        <input type="hidden" name="bookID" value="${queryBook.bookID}">
        <div class="control-group">
            <input type="submit" class="form-control" value="修改">

        </div>
    </form>

</div>
</body>
</html>
