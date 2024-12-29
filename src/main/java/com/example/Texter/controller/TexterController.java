package com.example.Texter.controller;

import com.example.Texter.model.TextContents;
import com.example.Texter.service.TexterService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/content")
class TexterController {
    private final TexterService texterService;

    TexterController(TexterService texterService) {
        this.texterService = texterService;
    }

    @PostMapping
    public TextContents saveContent(@RequestBody String content) {
        return texterService.saveContent(content);
    }

    @GetMapping("/{id}")
    public Optional<TextContents> getContent(@PathVariable String id) {
        return texterService.getContentById(id);
    }
}
