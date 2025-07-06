package com.research_assistant.controller;

import com.research_assistant.dto.ResearchRequest;
import com.research_assistant.service.ResearchService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@AllArgsConstructor
@CrossOrigin(origins = "*")

public class ResearchController {
    private final ResearchService  researchService;

    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }
}
