package com.servlet;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.*;
import com.DAO.*;
import com.services.*;
/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Client="";
		
		
		
		try{
		Project project=new Project();
			
			project.setProjectID(Integer.parseInt(request.getParameter("ProjectID")));
			project.setProjectname(request.getParameter("projectname"));
			project.setDomain(request.getParameter("Domain"));
			project.setTechnology(request.getParameter("Technology"));
			String clientList[]=request.getParameterValues("List of Clients");
			
	
			
			for(String loopVariable:clientList)
			 {
				Client= Client + loopVariable + ",";
			 }
			
			project.setClients(Client);
			

			ProjectService projectService= new ProjectService();
			int projectID= projectService.registerProject(project);
			
			request.setAttribute("projectID", projectID);
		
			RequestDispatcher rd= request.getRequestDispatcher("ProjectInfo.jsp");
			rd.forward(request, response);
		}
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
		
	
		
		
	
	}


