package com.example.oreo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CheckOreo {

    private final List<String> catStates = List.of("hungry", "thirsty", "bored", "wants to get pet", "play");

    @GetMapping("/endpoint")
    public Map<String, String> getCatStatus() {
        Random random = new Random();
        String randomState = catStates.get(random.nextInt(catStates.size()));

        return Map.of("status", randomState);


    }
}
