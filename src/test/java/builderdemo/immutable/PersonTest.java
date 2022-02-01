package builderdemo.immutable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = new Person(name, age);
        assertEquals(name, bean.getName());
        assertEquals(age, bean.getAge());
    }

    @Test
    void testCreateNoArgumentConstructor() {
        Person bean = new Person();
        assertNull(bean.getName());
        assertNull(bean.getAge());
    }

    @Test
    void testCreateOnlyAge() {
        Integer age = 42;
        Person bean = new Person(null, age);
        assertNull(bean.getName());
        assertEquals(age, bean.getAge());
    }

}
