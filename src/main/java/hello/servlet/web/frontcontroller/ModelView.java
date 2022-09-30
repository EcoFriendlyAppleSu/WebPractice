package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {

    private String viewName; // view에 관련한 정보
    private Map<String, Object> model = new HashMap<>(); // Model에 관련련
    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }
    public String getViewName() {
        return viewName;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
