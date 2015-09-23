
package com.services;
import com.bean.Project;

import com.services.*;

import java.util.ArrayList;


import com.DAO.*;



public class ProjectService 
	{
	
	
	 public ArrayList<Project> viewProject()throws Exception
	
	{
		ProjectDAO projectDao= new ProjectDAO();
		ArrayList<Project> projectLists=projectDao.viewProject();
		return projectLists; 
	
		
	}
	
	
	
	public int registerProject(Project project)throws Exception
	{
	
		ProjectDAO projectDAO= new ProjectDAO();
		 return   projectDAO.registerProject(project);
	}
	public Project updateProject(int id)throws Exception
	{
		ProjectDAO projectDAO= new ProjectDAO();
		return projectDAO.updateProject(id);
	}
	public boolean updateProject1(Project project)throws Exception
	{
		ProjectDAO projectDAO= new ProjectDAO();
		return projectDAO.updateProject1(project);
	}

	
}