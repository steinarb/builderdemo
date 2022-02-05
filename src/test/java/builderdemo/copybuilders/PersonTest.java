package builderdemo.copybuilders;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = Person.with()
            .name(name)
            .age(age)
            .build();
        assertEquals(name, bean.getName());
        assertEquals(age, bean.getAge());
    }

    @Test
    void testCreateNameOnly() {
        String name = "John Doe";
        Person bean = Person.with()
            .name(name)
            .build();
        assertEquals(name, bean.getName());
        assertNull(bean.getAge());
    }

    @Test
    void testCopyAndModify() {
        String name = "John Doe";
        Integer age = 42;
        Person person = Person.with()
            .name(name)
            .age(age)
            .build();
        Person agedPerson = Person.with(person).age(age + 1).build();
        assertEquals(name, agedPerson.getName());
        assertEquals(age + 1, agedPerson.getAge());
    }

}
