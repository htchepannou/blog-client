package com.tchepannou.blog.client.v1;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

public class PostRequest {
    //-- Attributes
    @NotBlank(message = "title_empty")
    @Length(max = 255, message="title_size")
    private String title;

    @Pattern(regexp = "draft|published", message="status_invalid")
    @NotBlank(message = "missing_status")
    private String status;

    private String content;

    @Length(max = 255, message="slug_size")
    private String slug;

    private List<String> tags;

    private Date published;

    @NotNull(message="userId_empty")
    private Long userId;

    //-- Getter/Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
