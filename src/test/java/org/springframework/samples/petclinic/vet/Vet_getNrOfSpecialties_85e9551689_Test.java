// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.vet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.model.Vet;

public class Vet_getNrOfSpecialties_85e9551689_Test {

    private Vet vet;

    @BeforeEach
    public void setup() {
        vet = new Vet();
    }

    @Test
    public void testGetNrOfSpecialties_NoSpecialties() {
        int expectedNrOfSpecialties = 0;
        int actualNrOfSpecialties = vet.getNrOfSpecialties();
        assertEquals(expectedNrOfSpecialties, actualNrOfSpecialties, "Number of specialties should be 0 when no specialties are added.");
    }

    @Test
    public void testGetNrOfSpecialties_WithSpecialties() {
        Set<String> specialties = new HashSet<>();
        specialties.add("Cardiology");
        specialties.add("Dentistry");
        specialties.add("Dermatology");

        vet.setSpecialtiesInternal(specialties);

        int expectedNrOfSpecialties = 3;
        int actualNrOfSpecialties = vet.getNrOfSpecialties();
        assertEquals(expectedNrOfSpecialties, actualNrOfSpecialties, "Number of specialties should match the number of specialties added.");
    }
}
