package com.onmobile.QADND;



import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HttpDNDStatus extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		try {
			doProcess(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void doProcess(HttpServletRequest request,HttpServletResponse response) throws Throwable
		{
			System.out.print("--------------inside servelet---------------");

	
			String msisdn=request.getParameter("msisdn");
			System.out.println("Msisdn :" +msisdn);
			

			if(msisdn.startsWith("8"))
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
