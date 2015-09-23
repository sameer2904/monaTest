<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add a Project</title>
</head>
<body>
<div class="header">ABC Infotech PVT Ltd</div>
<form action="CustomerController"  method="post" >
<fieldset>
<legend> Register Project</legend>
<table align="center" class= "tbl1"  border="1">
<caption >Register a Project </caption>
<tr> 
<td> ProjectID:</td>
<td> <input type="text" name="ProjectID" id="ProjectID"></input></td></tr>
<tr>
<td> Project Name:</td>
<td> <input type="text" name="projectname" id="projectname"></input></td></tr>
<tr>
<td>Domain </td>
<td><select name="Domain" style="width : 100%" id="odc"> 
<option value="HeathCare" >HeathCare </option>
<option value="India" >India </option>
<option value="Research" >Research </option>
<option value="Gov" >Gov </option>
</select></td></tr>
<tr>
<td>Technology </td>
<td><select name="Technology" style="width : 100%" id="odc"> 
<option value="JAVA" >JAVA </option>
<option value="CPP" >CPP </option>
<option value="ANDROID" >ANDROID </option>
<option value="UBUNTU" >UBUNTU </option>
</select></td></tr>
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
<td>&nbsp;</td>
<td> <input type="submit" value="Register" onclick="return validate()"></td>
</tr>
</table>

 </fieldset > 
 </form>
<br></br>
Click <a href="Home.jsp">Home  </a> to go to Home page.
<div class="footer">Copyright@AJA46 963745 Monika Kaushal</div>
</body>
</html>