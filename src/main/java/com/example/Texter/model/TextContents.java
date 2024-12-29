package com.example.Texter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class TextContents {
    @Id
    @Column(length = 36)  // Standard UUID length
    private String id;
    private String content;
    private String contentType;
    private String createdTimestamp;
    private String lastAccessedTimestamp;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID().toString();  // Generate UUID as String
        }
    }
    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }
    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
    public String getLastAccessedTimestamp() {
        return lastAccessedTimestamp;
    }
    public void setLastAccessedTimestamp(String lastAccessedTimestamp) {
        this.lastAccessedTimestamp = lastAccessedTimestamp;
    }

}
