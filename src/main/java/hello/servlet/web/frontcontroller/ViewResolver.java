package hello.servlet.web.frontcontroller;

public class ViewResolver {

    private String viewPath;
    private String prefix = "/WEB-INF/views/";
    private String postfix = ".jsp";
    private ViewResolver(String viewPath) {
        this.viewPath = prefix + viewPath + postfix;
    }

    public static ViewResolver from(String viewPath) {
        return new ViewResolver(viewPath);
    }

    public MyView getViewPath() {
        return new MyView(this.viewPath);
    }
}
