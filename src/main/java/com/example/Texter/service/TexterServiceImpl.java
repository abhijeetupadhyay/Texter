package com.example.Texter.service;

import com.example.Texter.model.TextContents;
import com.example.Texter.repository.TexterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Service
public class TexterServiceImpl implements TexterService {
    private final TexterRepository texterRepository;

    public TexterServiceImpl(TexterRepository texterRepository) {
        this.texterRepository = texterRepository;
    }

    @Override
    public TextContents saveContent(String content) {
        TextContents textContents = new TextContents();
        textContents.setId(UUID.randomUUID().toString());
        textContents.setContent(content);
        textContents.setContentType("Text");
        textContents.setCreatedTimestamp(LocalDate.now().toString());
        textContents.setLastAccessedTimestamp(LocalDate.now().toString());
        return texterRepository.save(textContents);
    }

    @Override
    public Optional<TextContents> getContentById(String id) {
        return texterRepository.findById(id);
    }
}
