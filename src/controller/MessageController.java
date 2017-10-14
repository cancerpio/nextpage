package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import module.ServiceMessage;
import module.ServicePrinter;

/**
 * Servlet implementation class MessageController
 */
@WebServlet(urlPatterns={"/MessageController/*"})
public class MessageController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public MessageController() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub
	// response.getWriter().append("Served at:
	// ").append(request.getContextPath());
	handleRequest(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub
	handleRequest(request, response);
    }

    private void handleRequest(HttpServletRequest request, HttpServletResponse response) {

	System.out.println(request.getParameter("index"));
	System.out.println(request.getParameter("document"));
	System.out.println(request.getRequestURL().toString());
	ServicePrinter servicePrinter;
	try {
	    servicePrinter = new ServicePrinter(new ServiceMessage() {

		@Override
		public String getMessage() {
		    // TODO Auto-generated method stub
		    return "service msg type 1";
		}
	    });

	    response.setContentType("text/plain");
	    response.getWriter().write(servicePrinter.getMsg());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
