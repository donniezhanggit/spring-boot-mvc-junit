<html>

<head>

    <title>
        first web application
    </title>

</head>
<body>

<%--<p>${"name"}</p>--%>
<%--<p>${param.values()}</p>--%>
<%--
<form method="post">
    Name : <input type="text" name="name"/>
    Password : <input type="password" name="password"/>
    <input type="submit"/>
</form>
--%>
Here are your list todos:
${param.values()}
<%--p>hello : ${param.get("name")}</p> <a href="/list-todos">Click here</a> to manage your Todo's
<p> your password is : ${param.get("password")} </p>--%>

</body>

</html>