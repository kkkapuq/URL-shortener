package joon.url_shortener.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ApiController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/api/shorten")
    @ResponseBody
    public Map<String, String> shortenUrl(@RequestBody Map<String, String> request) {
        String shortenedUrl = "http://short.url/" + generateShortCode();

        Map<String, String> response = new HashMap<>();
        response.put("shortenedUrl", shortenedUrl);
        return response;
    }

    private String generateShortCode() {
        return "abc12345";
    }
}
