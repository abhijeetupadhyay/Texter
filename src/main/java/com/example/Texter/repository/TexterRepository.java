package com.example.Texter.repository;

import com.example.Texter.model.TextContents;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TexterRepository extends JpaRepository<TextContents, String> {
}
