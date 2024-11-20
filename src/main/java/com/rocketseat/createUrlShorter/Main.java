package com.rocketseat.createUrlShorter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Main implements RequestHandler<Map<String, Object>, Map<String, String>> {

    @Override
    public Map<String, String> handleRequest(Map<String, Object> input, Context context) {
        String pathParameters = (String) input.get("rawPath");
        String shortUtlCode = pathParameters.replace("/", "");

        if (shortUtlCode == null || shortUtlCode.isEmpty()) {
            throw new IllegalArgumentException("Input inválido!");
        }
        return null;
    }
}