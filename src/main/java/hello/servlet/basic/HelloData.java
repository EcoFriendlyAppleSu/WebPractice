package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HelloData {

    private String username;
    private int age;

    public HelloData() {
    }

    public HelloData(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
