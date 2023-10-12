// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaseEntity_isNew_9b282f7a8e_Test {
    private BaseEntity baseEntity;

    @BeforeEach
    public void setup() {
        baseEntity = new BaseEntity();
    }

    @Test
    public void testIsNew_withNullId() {
        baseEntity.setId(null);
        assertTrue(baseEntity.isNew());
    }

    @Test
    public void testIsNew_withNonNullId() {
        baseEntity.setId(1);
        assertFalse(baseEntity.isNew());
    }
}
