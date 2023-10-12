// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitController_initNewVisitForm_de58f9a1b2_Test {

    @InjectMocks
    VisitController visitController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInitNewVisitForm_Success() {
        String view = visitController.initNewVisitForm();
        assertEquals("pets/createOrUpdateVisitForm", view);
    }

    @Test
    public void testInitNewVisitForm_Failure() {
        String view = visitController.initNewVisitForm();
        assertEquals("pets/wrongViewName", view);
    }
}
