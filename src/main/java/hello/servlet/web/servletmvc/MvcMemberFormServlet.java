package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// urlPatterns는 client에서 호출되는 URL이야
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         MvcMemberViewResolver.viewResolver("new-form",request,response);
        /*String viewPath = "/WEB-INF/views/new-form.jsp"; // rendering 되는 실제 jsp file 경로
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);// controller에서 view로 이동할 때 사용하는 dispatcher
        dispatcher.forward(request, response); // 다른 Servlet이나 JSP로 이동할 수 있는 기능, 서버 내부에서 다시 호출이 발생한다.*/
    }

}
