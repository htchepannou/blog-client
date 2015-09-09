package com.tchepannou.blog.client.v1;

public class AttachmentResponse {
    //-- Attributes
    private long id;
    private String name;
    private String description;
    private String url;
    private String thumbnailUrl;
    private Boolean oembed;
    private String contentType;
    private Long contentLength;
    private Integer durationSeconds;
    private Integer width;
    private Integer height;

    //-- Getter/Setter
    public boolean isVideo (){
        return contentType != null && contentType.startsWith("video/");
    }
    public boolean isImage (){
        return contentType != null && contentType.startsWith("image/");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Boolean getOembed() {
        return oembed;
    }

    public void setOembed(Boolean oembed) {
        this.oembed = oembed;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
