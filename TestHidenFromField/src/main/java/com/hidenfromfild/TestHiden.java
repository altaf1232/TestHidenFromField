package com.hidenfromfild;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHiden extends HttpServlet 
{
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
   try 
   { 
   
	res.setContentType("text/html");  
	PrintWriter out =res.getWriter();
	
	String name=req.getParameter("UserName");
	out.print("welcome"+name);
	
	
	out.print("<form action='TestHiden'>");
	 
    out.print("<input type='hidden' name='username' value='" + name + "'>");
    out.print("<input type='submit' value='submit'>");
    out.print("</form>");
    
    out.close();
	
   }
   catch(Exception e)
   {
     System.out.println();
   }
  }
}
