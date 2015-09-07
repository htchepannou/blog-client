package com.tchepannou.blog.client.v1;

import javax.validation.constraints.Pattern;
import java.util.Collection;
import java.util.HashSet;

public class SearchRequest {
    public static final String DEFAULT_STATUS = "all";
    public static final int DEFAULT_LIMIT = 20;

    private Collection<Long> blogIds = new HashSet<>();

    @Pattern(regexp = "all|draft|published", message="status_invalid")
    private String status = DEFAULT_STATUS;

    private int limit = DEFAULT_LIMIT;
    private int offset;

    public Collection<Long> getBlogIds() {
        return blogIds;
    }

    public void setBlogIds(Collection<Long> blogIds) {
        this.blogIds = blogIds;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
