<%-- 
    Document   : login
    Created on : Feb 15, 2021, 12:18:18 PM
    Author     : 842458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Login" method="POST">
        <h1>Login</h1>
        Username: <input type="text" name="username">
        <br>
        Password: <input type="text" name="password" >
        <br>
        <input type="submit" value="Log in">
        
        </form>
    </body>
</html>
