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
  
  <form action="sendCommand.jsp" method="POST">
  
  <select size="1" name="fromFloor" style="width: 137px; ">
  <%
  for(int i=-3;i<31;i++){
    out.print("<option>"+i+"</option>");
  }
  %>
  </select>
  
  <select size="1" name="toFloor" style="width: 137px; ">
  <%
  for(int i=-3;i<31;i++){
    out.print("<option>"+i+"</option>");
  }
  %>
  </select>
  
      
      <input type="submit" value="Submit" />
      <br/>
      <%
        String from = request.getParameter("fromFloor");
        String to = request.getParameter("toFloor");
        if(from!=null && to !=null){
          String command = "REQUEST ELEV FROM " + from + " TO " + to;
          SingletonCounter.getInstance().getResponseFromRESTPOSTInterface(command);
          out.print("Command sent : " +command);
        }
      %>
    </form>
</body>
</html>