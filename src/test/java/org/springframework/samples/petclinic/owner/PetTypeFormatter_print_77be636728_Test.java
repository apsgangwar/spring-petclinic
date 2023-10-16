// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PetTypeFormatter_print_77be636728_Test {
    
    @Mock
    private PetType petType;

    private PetTypeFormatter petTypeFormatter;

    @Before
    public void setup() {
        petTypeFormatter = new PetTypeFormatter();
    }

    @Test
    public void testPrint_Success() {
        when(petType.getName()).thenReturn("Dog");
        String result = petTypeFormatter.print(petType, LocaleContextHolder.getLocale());
        assertEquals("Dog", result);
    }

    @Test
    public void testPrint_NullPetType() {
        String result = petTypeFormatter.print(null, LocaleContextHolder.getLocale());
        assertEquals("", result);
    }
}
