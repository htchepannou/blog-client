package com.tchepannou.blog.client.v1;

import java.io.Serializable;
import java.util.Date;

public class PostEvent implements Serializable{
    //-- Attributes
    private long id;
    private long blogId;
    private String type;
    private String transactionId;
    private Date date;

    //-- Attributes
    public PostEvent(long id, long blogId, String type, String transactionId){
        this.id = id;
        this.type = type;
        this.transactionId = transactionId;
    }

    //-- Getter/Setter
    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public long getBlogId() {
        return blogId;
    }
}
