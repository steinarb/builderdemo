package builderdemo.javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = new Person();
        bean.setName(name);
        bean.setAge(age);
        assertEquals(name, bean.getName());
        assertEquals(age, bean.getAge());
    }

}
