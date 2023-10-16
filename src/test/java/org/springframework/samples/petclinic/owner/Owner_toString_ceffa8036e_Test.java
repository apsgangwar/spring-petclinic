// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.samples.petclinic.model.Person;

public class Owner_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Person owner = new Person();
        owner.setId(1);
        owner.setNew(true);
        owner.setLastName("Doe");
        owner.setFirstName("John");
        owner.setAddress("123 Street");
        owner.setCity("City");
        owner.setTelephone("1234567890");

        String expected = "ToStringCreator [value = {id=1, new=true, lastName=Doe, firstName=John, address=123 Street, city=City, telephone=1234567890}]";
        String actual = owner.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString_EmptyOwner() {
        Person owner = new Person();

        String expected = "ToStringCreator [value = {id=null, new=null, lastName=null, firstName=null, address=null, city=null, telephone=null}]";
        String actual = owner.toString();
        assertEquals(expected, actual);
    }
}
