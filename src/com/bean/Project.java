package com.bean;

public class Project 
{
private int ProjectID;
private String projectname;
private String Domain;
private String Technology;
private String Clients;



public Project() {
	super();
}


public Project(int projectID, String projectname, String domain,
		String technology, String clients) {
	super();
	this.ProjectID = projectID;
	this.projectname = projectname;
	this.Domain = domain;
	this.Technology = technology;
	this.Clients = clients;
}


	// TODO Auto-generated constructor stub

public int getProjectID() {
	return ProjectID;
}

public void setProjectID(int projectID) {
	ProjectID = projectID;
}

public String getProjectname() {
	return projectname;
}

public void setProjectname(String projectname) {
	this.projectname = projectname;
}

public String getDomain() {
	return Domain;
}

public void setDomain(String domain) {
	Domain = domain;
}

public String getTechnology() {
	return Technology;
}

public void setTechnology(String technology) {
	Technology = technology;
}


public String getClients() {
	return Clients;
}


public void setClients(String clients) {
this.Clients = clients;
}



}