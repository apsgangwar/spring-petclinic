// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.validation.BindingResult;

public class OwnerController_processUpdateOwnerForm_a228651f5b_Test {

    @Mock
    private OwnerRepository owners;

    @Mock
    private BindingResult result;

    @InjectMocks
    private OwnerController ownerController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProcessUpdateOwnerFormSuccess() {
        Owner owner = new Owner();
        owner.setFirstName("John");
        owner.setLastName("Doe");

        when(result.hasErrors()).thenReturn(false);

        String view = ownerController.processUpdateOwnerForm(owner, result, 1);

        assertEquals("redirect:/owners/{ownerId}", view);
    }

    @Test
    public void testProcessUpdateOwnerFormFailure() {
        Owner owner = new Owner();
        owner.setFirstName("John");
        owner.setLastName("Doe");

        when(result.hasErrors()).thenReturn(true);

        String view = ownerController.processUpdateOwnerForm(owner, result, 1);

        assertEquals("owners/createOrUpdateOwnerForm", view);
    }
}
