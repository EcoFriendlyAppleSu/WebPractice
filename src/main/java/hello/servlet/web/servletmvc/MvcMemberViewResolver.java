package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MvcMemberViewResolver extends HttpServlet {

    public static void viewResolver(String path, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prefix = "/WEB-INF/views/";
        String postfix = ".jsp";

        String dispatcherWebPath = prefix + path + postfix;
        RequestDispatcher dispatcher = request.getRequestDispatcher(dispatcherWebPath);
        dispatcher.forward(request, response);
    }
}
