// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.model.BaseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Visit_Visit_02adeb17dc_Test {

    private Visit visit;

    @BeforeEach
    public void setup() {
        visit = new Visit();
    }

    @Test
    public void testVisitDateNow() {
        LocalDate expectedDate = LocalDate.now();
        assertEquals(expectedDate, visit.getDate());
    }

    @Test
    public void testVisitDateNotNull() {
        assertNotNull(visit.getDate());
    }
}
