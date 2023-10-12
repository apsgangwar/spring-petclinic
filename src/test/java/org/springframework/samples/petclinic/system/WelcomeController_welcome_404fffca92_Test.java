// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.petclinic.system.WelcomeController;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WelcomeController_welcome_404fffca92_Test {

    @Autowired
    private WelcomeController welcomeController;

    @Test
    public void testWelcomeSuccess() {
        String expectedOutput = "welcome";
        String actualOutput = welcomeController.welcome();
        assertEquals(expectedOutput, actualOutput, "Expected welcome message does not match actual welcome message");
    }

    @Test
    public void testWelcomeFailure() {
        String expectedOutput = "not_welcome";
        String actualOutput = welcomeController.welcome();
        assertEquals(expectedOutput, actualOutput, "Expected welcome message does not match actual welcome message");
    }
}
