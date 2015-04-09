<%@page import="java.util.Collections"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.msdp.kone.m2m.sample.SingletonCounter"%>
    <%@page import="java.util.List"%>
    <%@page import="com.msdp.kone.m2m.client.Output"%>
    <%@page import="com.msdp.kone.m2m.client.PayloadType"%>
    <%@page import="com.msdp.kone.m2m.client.PayloadType.Value"%>
    <%@page import="com.msdp.kone.m2m.json.Elevator"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Elevator status page</title>
</head>
<body>
  <table width="59%" border="1">
  
  <thead>
            <tr>
                <th align="center">Event Received</th>
                <th align="center">Lift Mode</th>
                <th align="center">Actual Position</th>
                <th align="center">Next Landing</th>
                <th align="center">Direction</th>
                <th align="center">Door State</th>
            </tr>
 </thead>
  
  <% 
       List<Output> items = SingletonCounter.getInstance().getM2mData();
  
       for(int i=items.size()-1 ;i >= 0 ; i--)
        {
    	   Output item = items.get(i);
            %>
                   <tr> 
                
                <%List<PayloadType> payload = item.getData();
                for (PayloadType data:payload)
                {
                	Elevator elevator = SingletonCounter.getInstance().getGson().fromJson(data.getValue().getValue(), Elevator.class);
                %>
                     <td>
                     <%= data.getTimestamp()%>
                     </td>
                     <td>
                     <%= elevator.getLiftMode()%>
                     </td>
                     <td>
                     <%= elevator.getActualPosition()%>
                     </td>
                     
                     <td>
                     <%= elevator.getNextLanding()%>
                     </td>
                     
                     <td>
                     <%= elevator.getDirection()%>
                     </td>
                     
                     <td>
                     <%= elevator.getDoorState()%>
                     </td>
                     
                     <%
                }
                %>
                </tr>
            <% 
        }
            %>
  </table>
</body>
</html>