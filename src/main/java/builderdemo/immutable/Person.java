package builderdemo.immutable;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this(null, null);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
