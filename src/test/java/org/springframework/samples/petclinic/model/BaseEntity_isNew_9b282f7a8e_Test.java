// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.model;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BaseEntity_isNew_9b282f7a8e_Test {

    @InjectMocks
    BaseEntity baseEntity;

    @Test
    public void testIsNew() {
        assertTrue(baseEntity.isNew()); // Since id is null
    }

    @Test
    public void testIsNotNew() {
        baseEntity.setId(5);
        assertFalse(baseEntity.isNew()); // Since id is not null
    }
}
