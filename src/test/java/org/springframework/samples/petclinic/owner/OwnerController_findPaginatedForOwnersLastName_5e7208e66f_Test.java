// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OwnerController_findPaginatedForOwnersLastName_5e7208e66f_Test {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private OwnerController ownerController;

    private List<Owner> ownerList;
    private Page<Owner> ownerPage;

    @BeforeEach
    public void setup() {
        Owner owner1 = new Owner();
        owner1.setLastName("Smith");
        Owner owner2 = new Owner();
        owner2.setLastName("Johnson");
        ownerList = Arrays.asList(owner1, owner2);
        ownerPage = new PageImpl<>(ownerList);
    }

    @Test
    public void testFindPaginatedForOwnersLastName() {
        when(owners.findByLastName(any(String.class), any(Pageable.class))).thenReturn(ownerPage);

        Page<Owner> result = ownerController.findPaginatedForOwnersLastName(1, "Smith");

        assertNotNull(result);
        assertEquals(ownerPage.getTotalElements(), result.getTotalElements());
        assertEquals(ownerPage.getContent().get(0).getLastName(), result.getContent().get(0).getLastName());
    }

    @Test
    public void testFindPaginatedForOwnersLastNameWithNoData() {
        when(owners.findByLastName(any(String.class), any(Pageable.class))).thenReturn(Page.empty());

        Page<Owner> result = ownerController.findPaginatedForOwnersLastName(1, "Doe");

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
