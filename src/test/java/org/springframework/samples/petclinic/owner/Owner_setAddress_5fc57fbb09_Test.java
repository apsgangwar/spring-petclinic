// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.util.Assert;

public class Owner_setAddress_5fc57fbb09_Test {

    private Person person;

    @BeforeEach
    public void setup() {
        person = new Person();
    }

    @Test
    public void testSetAddress_ValidAddress() {
        String address = "123 Main St";
        person.setAddress(address);
        Assert.isTrue(person.getAddress().equals(address), "Address should be set properly");
    }

    @Test
    public void testSetAddress_EmptyAddress() {
        String address = "";
        person.setAddress(address);
        Assert.isTrue(person.getAddress().equals(address), "Address should be set even if it's empty");
    }

    @Test
    public void testSetAddress_NullAddress() {
        String address = null;
        person.setAddress(address);
        Assert.isTrue(person.getAddress() == null, "Address should be null if set as null");
    }

}
