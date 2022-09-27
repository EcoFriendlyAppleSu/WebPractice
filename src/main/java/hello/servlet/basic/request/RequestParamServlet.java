package hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* Param으로 Client에서 Server에 Data 전송.
* 검색 필터 Paging 등에서 사용됩니다.
* localhost:8080/request-param?username=hello&age=20
* */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String element = parameterNames.nextElement();
            System.out.println("element = " + element);
            System.out.println("parameter = " + request.getParameter(element));
        }

        // Name is Key. if you want to get value, you should use request.getParameter() method
        System.out.println("Using Lambda");
        request.getParameterNames().asIterator().forEachRemaining(param -> System.out.println("parameterNames = " + param +
                " parameter data = " + request.getParameter(param)
        ));

        // 단일 param 조회
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("username = " + username);
        System.out.println("age = " + age);

        // 이름이 같은 복수 파라미터 조회
        String[] usernames = request.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("name = " + name);
        }

        response.getWriter().write("ok");
    }
}
