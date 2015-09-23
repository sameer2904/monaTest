package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Project;
import com.services.ProjectService;

/**
 * Servlet implementation class updateEnd
 */
public class updateEnd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateEnd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Project project=new Project();
		PrintWriter out=response.getWriter();
		project.setProjectID(Integer.parseInt(request.getParameter("ProjectID")));
		project.setProjectname(request.getParameter("Projectname"));
		project.setDomain(request.getParameter("Domain"));
		project.setTechnology(request.getParameter("Technology"));
		project.setClients(request.getParameter("Clients"));
		ProjectService projectService=new ProjectService();
		try{
				
				boolean isUpdated= projectService.updateProject1(project);
				if(isUpdated)
				out.println("<html> <body>record successfully updated <br></br><a href=Home.jsp>Home</a></body></html>");		
				else
					out.println("record not  updated");		
			}
				
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
