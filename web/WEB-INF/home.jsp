<%-- 
    Document   : home
    Created on : Feb 15, 2021, 12:18:33 PM
    Author     : 842458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <form>
             <% 
                 String myName = "";
            if(session.getAttribute("uname")==null){
                response.sendRedirect("/WEB-INF/login.jsp");
            } else {
                myName = (String) session.getAttribute("uname");
            }
            %>
            <h2>Hello <%=myName%></h2>
            <a href="./HomeServlet"><% session.invalidate(); %> Log out</a>
            </form>
    </body>
</html>
