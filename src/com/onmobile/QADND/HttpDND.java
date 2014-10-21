package com.onmobile.QADND;
//test
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpDND
 */

//checking first change in branch1 commit

@WebServlet("/HttpDND")
public class HttpDND extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpDND() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
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
	
	public void doProcess(HttpServletRequest request,HttpServletResponse response) throws Throwable
	{
		System.out.print("--------------inside servelet---------------");


		String msisdn=request.getParameter("msisdn");
		System.out.println("test Msisdn  :" +msisdn);
		

		if(msisdn.startsWith("8") || msisdn.equalsIgnoreCase("9849778690") || msisdn.equalsIgnoreCase("9003435362") || msisdn.equalsIgnoreCase("9964933444") || msisdn.equalsIgnoreCase("9582435362") )
		{
			response.setContentType("text/plain");
			response.setStatus(200);
			ServletOutputStream os= response.getOutputStream();
			os.print("true");
		}		
		else
		{
			response.setContentType("text/plain");
			response.setStatus(200);
			ServletOutputStream os= response.getOutputStream();
			os.print("false");
		}		
	}

}
