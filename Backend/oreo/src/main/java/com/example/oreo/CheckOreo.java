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

    private final List<String> catStates = List.of("am hungry", "am thirsty", "am bored", "wanna get pet", " wanna play", " wanna bite you RAAHHH");

    @GetMapping("/endpoint")
    public Map<String, String> getCatStatus() {
        Random random = new Random();
        String randomState = catStates.get(random.nextInt(catStates.size()));

        return Map.of("status", randomState);


    }
}
