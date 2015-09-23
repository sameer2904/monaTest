<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Project Info</title>
</head>
<body>
<p>
Thank you!!
<br></br>
</p>

<p>
<% 
int projectID=Integer.parseInt(request.getAttribute("projectID").toString());

if(projectID>0)
{
	%> User is created. Please note userID : <%= projectID %> 
	Click <a href="Home.jsp">Home</a>to go to home page.<%
}

else
{
	%> User not created. Try again!
Click <a href="Home.jsp">Home</a>to go to home page.<%
}

%>


</p>


</body>
</html>