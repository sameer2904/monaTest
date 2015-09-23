<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.bean.Project" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>



<p>
DETAILS ARE AS FOLLOWS :

</p>
<% ArrayList<Project> project = (ArrayList<Project>)request.getAttribute("projects");

if(project.size()>0)
{
%>

<table border="1">

<tr>
<td>Project ID</td>
<td>Project Name:</td>
<td>Domain:</td>
<td>Technology</td>
<td>List of Clients</td>
<td>View</td>



</tr>

<%
for(Project pro:project)
{
%>
<tr>
<td><%=pro.getProjectID() %></td>
<td><%=pro.getProjectname() %></td>
<td><%=pro.getDomain() %></td>
<td><%=pro.getTechnology() %></td>
<td><%=pro.getClients() %></td>

<td><a href="<%=request.getContextPath()%>/update?ProjectID=<%=pro.getProjectID() %>">VIEW</a></td>

</tr>

<%
} 
%>
</table>

<%
}
else
{
	%>
	
	
<table>
<tr>
<td>Operation not performed. Please Try again.</td>
</tr></table>

<%
}
%>


<a href="Home.jsp">Click to go to Home page</a>


</body>
</html>