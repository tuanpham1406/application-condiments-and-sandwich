<%--
  Created by IntelliJ IDEA.
  User: aya
  Date: 27/05/2019
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Application</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="save" method="post">
    <input type="checkbox" name="lettuce">Lettuce
    <input type="checkbox" name="tomato">Tomato
    <input type="checkbox" name="mustard">Mustard
    <input type="checkbox" name="sprouts">Sprouts<br/><br/>
    <input type="submit" value="save">
  </form>
  </body>
</html>