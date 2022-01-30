package builderdemo.builders;

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

    public static class Builder {

        private String name;
        private Integer age;

        public Person build() {
            Person bean = new Person();
            bean.name = this.name;
            bean.age = this.age;
            return bean;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

    }

}
