package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class HelloLombok {
    private int age;
    private String name;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        System.out.println(helloLombok.getAge());
        System.out.println("helloLombok = " + helloLombok);
    }
}
