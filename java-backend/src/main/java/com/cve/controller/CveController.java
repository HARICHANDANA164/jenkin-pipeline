package com.cve.controller;

import com.cve.service.PredictionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cve")
public class CveController {

    private final PredictionService predictionService;

    public CveController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @PostMapping("/predict")
    public ResponseEntity<String> predict(@RequestBody String description) {
        return ResponseEntity.ok(
                predictionService.predictSeverity(description));
    }
}
