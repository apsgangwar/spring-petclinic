// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OwnerController_processUpdateOwnerForm_a228651f5b_Test {

    @InjectMocks
    private OwnerController ownerController;

    @Mock
    private OwnerRepository owners;

    @Mock
    private Owner owner;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProcessUpdateOwnerForm_hasErrors() {
        BindingResult result = new BeanPropertyBindingResult(owner, "owner");
        result.reject("error");
        String view = ownerController.processUpdateOwnerForm(owner, result, 1);
        assertEquals("owners/createOrUpdateOwnerForm", view);
    }

    @Test
    public void testProcessUpdateOwnerForm_noErrors() {
        BindingResult result = new BeanPropertyBindingResult(owner, "owner");
        when(owner.getId()).thenReturn(1);
        String view = ownerController.processUpdateOwnerForm(owner, result, 1);
        verify(owners).save(owner);
        assertEquals("redirect:/owners/1", view);
    }

}
