package com.cve.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class PredictionService {

    private static final String PYTHON_SCRIPT = "..\\python-ml\\predict.py";

    public String predictSeverity(String description) {
        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "python",
                    PYTHON_SCRIPT,
                    description);

            pb.redirectErrorStream(true);
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {
                return reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException("Python prediction failed", e);
        }
    }
}
