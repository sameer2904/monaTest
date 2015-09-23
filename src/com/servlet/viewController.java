package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.Project;
import com.services.ProjectService;

/**
 * Servlet implementation class viewController
 */
public class viewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewController() {
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
		try{
			
			ArrayList<Project> projects=new ArrayList<Project>();
				
			ProjectService projectService= new ProjectService();
			projects=projectService.viewProject();
			
			request.setAttribute("projects", projects);
			RequestDispatcher rd= request.getRequestDispatcher("ViewDetails.jsp");
			rd.forward(request, response);
			
		}
			
			catch(Exception e){
				e.printStackTrace();
			}
		
		
		
	}

}
