<!DOCTYPE html>
<Html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    </thead>
    <tbody>
    <#list usersList as users>
        <tr>
            <td>${users.id }</td>
            <td>${users.username }</td>
            <td>${users.password }</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</Html>