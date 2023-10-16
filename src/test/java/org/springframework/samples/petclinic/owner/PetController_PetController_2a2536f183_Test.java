// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class PetControllerTest {

    @Mock
    OwnerRepository owners;

    @InjectMocks
    PetController petController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPetController() {
        PetController petController = new PetController(owners);
        assertNotNull(petController);
    }

    @Test
    void testPetControllerNull() {
        assertThrows(NullPointerException.class, () -> new PetController(null));
    }
}
