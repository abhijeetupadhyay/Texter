package com.example.Texter.service;

import com.example.Texter.model.TextContents;

import java.util.Optional;

public interface TexterService {
    TextContents saveContent(String content);
    Optional<TextContents> getContentById(String id);
}
