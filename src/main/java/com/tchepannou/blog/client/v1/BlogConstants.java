package com.tchepannou.blog.client.v1;

public class BlogConstants {
    public static final String METRIC_GET_POST = "blog-get-post";
    public static final String METRIC_REBLOG_POST = "blog-reblog-post";
    public static final String METRIC_GET_POST_LIST = "blog-get-post-list";
    public static final String METRIC_CREATE_POST = "blog-create-post-post";
    public static final String METRIC_UPDATE_POST = "blog-update-post-post";
    public static final String METRIC_DELETE_POST = "blog-delete-post";

    public static final String QUEUE_EVENT_LOG = "blog-queue-event-log";
    public static final String EVENT_CREATE_POST = "blog-create-post";
    public static final String EVENT_UPDATE_POST = "blog-update-post";
    public static final String EVENT_DELETE_POST = "blog-deleted-post";
    public static final String EVENT_REBLOG_POST = "blog-reblog-post";


    private BlogConstants(){

    }

}
