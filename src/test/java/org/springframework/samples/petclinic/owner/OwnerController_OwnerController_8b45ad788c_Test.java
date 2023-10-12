// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.OwnerController;

class OwnerController_OwnerController_8b45ad788c_Test {

    private OwnerRepository owners;
    private OwnerController ownerController;

    @BeforeEach
    void setUp() {
        owners = mock(OwnerRepository.class);
        ownerController = new OwnerController(owners);
    }

    @Test
    void testOwnerController_success() {
        assertNotNull(ownerController);
    }

    @Test
    void testOwnerController_failure() {
        assertThrows(NullPointerException.class, () -> new OwnerController(null));
    }
}
