package builderdemo.copybuilders;

public class Person {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static Builder with() {
        return new Builder();
    }

    public static Builder with(Person person) {
        Builder builder = new Builder();
        builder.name = person.name;
        builder.age = person.age;
        return builder;
    }

    private Person() { }

    public static class Builder {

        private String name;
        private Integer age;

        public Person build() {
            Person bean = new Person();
            bean.name = this.name;
            bean.age = this.age;
            return bean;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        private Builder() { }

    }

}
