// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.petclinic.model.Pet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class Owner_getPet_981a356ffc_Test {

    @InjectMocks
    private Owner owner;

    @Test
    public void testGetPet_success() {
        Pet pet = new Pet();
        pet.setName("Fido");
        owner.addPet(pet);

        Pet result = owner.getPet("Fido");
        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("Fido");
    }

    @Test
    public void testGetPet_petNotFound() {
        Pet result = owner.getPet("NotExistingPet");
        assertThat(result).isNull();
    }
}
