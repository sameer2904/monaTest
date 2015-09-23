<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bean.Project" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">
		<img alt="Header" src="Logo.jpg" align="left" height="5%" width="5%">
		<h1>ABCD INFOTECH PVT Ltd</h1>
	</div>
	<div id="content">
	<br></br>
		<br></br>
		<center>
		<%Project p=(Project)request.getAttribute("data"); %>
			<form action="updateEnd" method="get">
			<table>
					<tr>
						<th>Project ID</th>
						<td><input type="text" name="ProjectID" id="ProjectID" required="required" value=<%=p.getProjectID()%> readonly="readonly" ></td>
					</tr>
					<tr>
						<th>Project Name</th>
						<td><input type="text" name="Projectname" id="Projectname" required="required" value=<%=p.getProjectname()%>></td>
					</tr>
					<tr>
					<th>Domain</th>
						<td>
						<% String s=p.getDomain(); %>
							<select name="domain">
							<option value="Select">Select</option>
								<option value="HeathCare"<%if(s.equalsIgnoreCase("HeathCare")){%> selected="selected"<%} %>>HeathCare</option>
								<option value="India"<%if(s.equalsIgnoreCase("India")){%> selected="selected"<%} %>>India</option>
								<option value="Research"<%if(s.equalsIgnoreCase("Research")){%> selected="selected" <%} %>>Research</option>
							<option value="Gov"<%if(s.equalsIgnoreCase("Gov")){%> selected="selected" <%} %>>Gov</option>
							</select>
						</td>
					</tr>
				<tr>
		
					<th>Technology</th>
						<td>
						<% String s1=p.getTechnology(); %>
							<select name="Technology">
							<option value="Select">Select</option>
								<option value="JAVA"<%if(s1.equalsIgnoreCase("JAVA")){ %> selected="selected" <%} %>>JAVA</option>
								<option value="CPP"<%if(s1.equalsIgnoreCase("CPP")){ %> selected="selected" <%} %>>CPP</option>
								<option value="ANDROID"<%if(s1.equalsIgnoreCase("ANDROID")){ %> selected="selected" <%} %>>"ANDROID"</option>
							    <option value="UBUNTU" <%if(s1.equalsIgnoreCase("UBUNTU" )){ %> selected="selected" <%} %>>"UBUNTU" </option>
							</select>
						</td>
					</tr>
				
					<tr>
<td> Client </td>
<td><input type="checkbox"  name="List of Clients" value="USA">USA </td></tr>

<tr>
<td>&nbsp;</td>
<td><input type="checkbox" name="List of Clients" value="India">India</td>
</tr>

<tr>
<td>&nbsp;</td>
<td><input type="checkbox" name="List of Clients" value="JAPAN">JAPAN</td>
</tr>

<tr>
<td>&nbsp;</td>
<td><input type="checkbox" name="List of Clients" value="NORWAY">NORWAY</td>
</tr>



					<tr>
						<td><center><input type="submit" value="Update"></center></td>
					</tr>
				</table>
				</form>
				</center>
				<br></br>
		<br></br>
		<center><a href="Home.jsp">Home</a></center>
	</div>
	<div id="footer">
		<center>&copy; AJA46 963745 Monika Kaushal </center>
	</div>

</body>
</html>