// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PetTypeFormatter_parse_2ffcaf4072_Test {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private PetTypeFormatter petTypeFormatter;

    private PetType petType1;
    private PetType petType2;

    @BeforeEach
    public void setup() {
        petType1 = new PetType();
        petType1.setName("Dog");
        petType2 = new PetType();
        petType2.setName("Cat");
    }

    @Test
    public void testParse_success() throws ParseException {
        when(owners.findPetTypes()).thenReturn(Arrays.asList(petType1, petType2));
        PetType actualPetType = petTypeFormatter.parse("Dog", Locale.ENGLISH);
        assertEquals(petType1, actualPetType);
    }

    @Test
    public void testParse_failure() {
        when(owners.findPetTypes()).thenReturn(Arrays.asList(petType1, petType2));
        assertThrows(ParseException.class, () -> petTypeFormatter.parse("Bird", Locale.ENGLISH));
    }
}
