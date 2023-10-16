// Test generated by RoostGPT for test aps-java-pet using AI Type Open AI and AI Model gpt-4

package org.springframework.samples.petclinic.vet;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VetController_findPaginated_401e518f2c_Test {

    @Mock
    private VetRepository vetRepository;

    @InjectMocks
    private VetController vetController;

    private List<Vet> vetList;

    @BeforeEach
    public void setup() {
        // TODO: Initialize vetList with actual data
        vetList = new ArrayList<>();
        Vet vet = new Vet();
        vet.setFirstName("John");
        vet.setLastName("Doe");
        vetList.add(vet);
    }

    @Test
    public void testFindPaginated() {
        int page = 1;
        int pageSize = 5;
        Pageable pageable = PageRequest.of(page - 1, pageSize);
        Page<Vet> vetPage = new PageImpl<>(vetList, pageable, vetList.size());

        when(vetRepository.findAll(pageable)).thenReturn(vetPage);

        Page<Vet> result = vetController.findPaginated(page);

        assertEquals(vetPage, result);
        assertEquals(vetList.size(), result.getTotalElements());
    }

    @Test
    public void testFindPaginated_EmptyList() {
        int page = 1;
        int pageSize = 5;
        Pageable pageable = PageRequest.of(page - 1, pageSize);
        Page<Vet> vetPage = Page.empty(pageable);

        when(vetRepository.findAll(pageable)).thenReturn(vetPage);

        Page<Vet> result = vetController.findPaginated(page);

        assertEquals(vetPage, result);
        assertEquals(0, result.getTotalElements());
    }
}
