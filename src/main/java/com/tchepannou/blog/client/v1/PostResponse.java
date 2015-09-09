package com.tchepannou.blog.client.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PostResponse {
    //-- Attributes
    private long id;
    private long blogId;
    private long userId;
    private String title;
    private String slug;
    private String content;
    private String status;
    private Date published;
    private Date created;
    private Date updated;
    private List<String> tags = new ArrayList<>();
    private List<AttachmentResponse> attachments = new ArrayList<>();
    private Long mainAttachmentId;

    //-- Public
    public void addTag(String tag){
        tags.add(tag);
    }

    public void addAttachment(AttachmentResponse attachment){
        attachments.add(attachment);
    }

    //-- Getter/Setter
    public List<AttachmentResponse> getAttachments() {
        return attachments;
    }

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
        return Collections.unmodifiableList(tags);
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Long getMainAttachmentId() {
        return mainAttachmentId;
    }

    public void setMainAttachmentId(Long mainAttachmentId) {
        this.mainAttachmentId = mainAttachmentId;
    }
}
