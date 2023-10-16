// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.samples.petclinic.model.BaseEntity;

public class Visit_getDate_efa9e4d8bf_Test {

    @Test
    public void testGetDate() {
        BaseEntity visit = new BaseEntity();
        LocalDate expectedDate = LocalDate.now();
        visit.setDate(expectedDate);
        LocalDate actualDate = visit.getDate();
        assertEquals(expectedDate, actualDate);
    }
    
    @Test
    public void testGetDateNull() {
        BaseEntity visit = new BaseEntity();
        LocalDate actualDate = visit.getDate();
        assertEquals(null, actualDate);
    }
}
