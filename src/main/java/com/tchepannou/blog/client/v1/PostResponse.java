package com.tchepannou.blog.client.v1;

import java.util.ArrayList;
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
    private List<String> tags;
    private List<Long> attachmentIds;

    //-- Public
    public void addTag(String tag){
        if (tags == null){
            tags = new ArrayList<>();
        }
        tags.add(tag);
    }

    public void addAttachment(long attachmentId){
        if (attachmentIds == null){
            attachmentIds = new ArrayList<>();
        }
        attachmentIds.add(attachmentId);
    }

    //-- Getter/Setter
    public List<Long> getAttachmentIds() {
        return attachmentIds;
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
        return tags;
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
}
