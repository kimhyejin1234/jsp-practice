package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;
import user.User_self;




@WebServlet("/el/obj_self")
public class ElServletSelf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ElServletSelf() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User_self user = new User_self(
				request.getParameter("id"),
				request.getParameter("pw"),
				request.getParameter("name"),
				request.getParameter("email")
		);
		
		request.getSession().setAttribute("member", user);
		response.sendRedirect("/JspBasic/EL/el_obj3_self.jsp");
		
	}


}
