
package com.DAO;
import com.util.DBUtil;
import com.bean.Project;
import com.DAO.*;


import com.util.DBUtil;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;


public class ProjectDAO 
	{
	
	public int registerProject(Project newproject)throws Exception
	{
		Connection conn=DBUtil.getConnection();
		PreparedStatement pst=null;
		PreparedStatement pst1=null;
		ResultSet rs=null;
		System.out.println("connection "+conn);
		int projectID=0;
		try
		{
			pst= conn.prepareStatement("insert into TBL_CUSTOMER_963745555 values(?,?,?,?,?)");
			
			
			
			pst.setInt(1, newproject.getProjectID());
			pst.setString(2, newproject. getProjectname());
			pst.setString(3,newproject.getDomain());
			pst.setString(4,newproject.getTechnology());
			pst.setString(5,newproject.getClients());
		
			
			projectID=pst.executeUpdate();
			
			
		pst1=conn.prepareStatement("Select Project_ID from TBL_CUSTOMER_96374555");
		
		rs=pst1.executeQuery();	
	
	if(rs.next())
		{
		projectID=rs.getInt(1);
	
    }
		}
		
	   catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			
		}
		return projectID;
		
		
		
		}
	
	
	public ArrayList<Project> viewProject()throws Exception
	{
		ArrayList<Project> projectList=new ArrayList<Project>();
		Connection conn=DBUtil.getConnection();
		
		PreparedStatement pst=null;
		
		ResultSet rs=null;
		
		try
		{
		pst=conn.prepareStatement("select * from TBL_CUSTOMER_963745555");
		
		rs=pst.executeQuery();
		
		while(rs.next())
		{
			int id=rs.getInt("project_ID");
			String custName=rs.getString("project_name");
	        String domain=rs.getString("domain");
			String tech=rs.getString("technology");
			String client=rs.getString("clients");
			
			Project project=new Project();
			
			project.setProjectID(id);
			project.setProjectname(custName);
			project.setDomain(domain);
			project.setTechnology(tech);
			project.setClients(client);
			
			projectList.add(project); 
			 
		}
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return projectList; 
}
	
	 public Project updateProject(int id) throws Exception
	 {
		 Connection con=DBUtil.getConnection();
			PreparedStatement pst1=null;
			ResultSet rs1=null;
			Project project=new Project();
			try
			{
				pst1=con.prepareStatement("SELECT * FROM TBL_CUSTOMER_963745555 where PROJECT_ID=?");
				pst1.setInt(1, id);
				rs1=pst1.executeQuery();
				while(rs1.next() && rs1!=null)
				{
									
					project.setProjectID(rs1.getInt("PROJECT_ID"));
					project.setProjectname(rs1.getString("PROJECT_NAME"));
					project.setDomain(rs1.getString("DOMAIN"));
					project.setTechnology(rs1.getString("TECHNOLOGY"));
					project.setClients(rs1.getString("CLIENT"));
							   
				}
				
			}
			 catch (Exception e) 
				{
					e.printStackTrace();
					throw new ServletException("DB connection problem");
				}
				finally
				{
					if(con!=null)
					{
						try
						{
							con.close();
						}
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				}
			return project;
		
	 }
	
	 public boolean updateProject1(Project project) throws Exception
	    {
	    	
	    	Connection con=DBUtil.getConnection();
	    	PreparedStatement pst=null;
	    	int i=0;
	    	boolean a= true;
	    	
	    	try
	    	{
	    		pst=con.prepareStatement("UPDATE TBL_CUSTOMER_963745555 SET PROJECT_NAME=?,DOMAIN=?,TECHNOLOGY=?,CLIENT=? WHERE PROJECT_ID=?");
	    		pst.setString(1, project.getProjectname());
	    		pst.setString(2, project.getDomain());
	    		pst.setString(3, project.getTechnology());
	    		pst.setString(4, project.getClients());
	    		pst.setInt(5, project.getProjectID());
	    		i=pst.executeUpdate();
	    		if(i>0)
	    			a= true;
	    		else 
	    			a=false;
	    	}
	    
	    		catch (Exception e) 
				{
					e.printStackTrace();
					
				}
				finally
				{
					if(con!=null)
					{
						try
						{
							con.close();
						}
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				}
	    	return a;
	    }
	}
					
				
	    
	    
	    
		
	
