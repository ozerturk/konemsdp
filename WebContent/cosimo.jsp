<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.msdp.kone.m2m.sample.SingletonCounter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Insert title here</title>
</head>
<body>
  
  <form action="cosimo.jsp" method="POST">
  
      <input type="text" name="command" />
      <input type="submit" value="Submit" />
      <br/>
      <%
        String command = request.getParameter("command");
        if(command !=null){
          //String command = "REQUEST ELEV FROM " + from + " TO " + to;
          SingletonCounter.getInstance().getResponseFromRESTPOSTInterface(command);
          out.print("Command sent : " +command);
        }
      %>
    </form>
</body>
</html>
