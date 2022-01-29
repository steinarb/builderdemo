package builderdemo.fluentapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = new Person()
            .setName(name)
            .setAge(age);
        assertEquals(name, bean.getName());
        assertEquals(age, bean.getAge());
    }

}
