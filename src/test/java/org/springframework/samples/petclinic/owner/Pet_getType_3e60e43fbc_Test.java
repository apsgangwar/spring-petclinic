// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.samples.petclinic.model.PetType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pet_getType_3e60e43fbc_Test {

    Pet pet;

    @BeforeEach
    void setup() {
        pet = new Pet();
    }

    @Test
    public void testGetType() {
        PetType type = new PetType();
        type.setName("Dog");
        pet.setType(type);
        assertEquals(type, pet.getType());
    }

    @Test
    public void testGetType_Null() {
        assertEquals(null, pet.getType());
    }
}
