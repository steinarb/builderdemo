package builderdemo.fluentapi;

public class Person {

    private String name;
    private Integer age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getAge() {
        return age;
    }

}
