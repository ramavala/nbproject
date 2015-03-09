<%-- 
    Document   : UserAdd
    Created on : Mar 7, 2015, 9:47:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>UserAdd</h1>
        <form name="frm" action="UserServlet" method="post">
            <label>Name</label>
            <input type="text" name="name"><br>
        <label>Age</label>
        <input  type="text" name="age"><br>
        <input type="submit" value="submit">
        
        </form>
    </body>
</html>
