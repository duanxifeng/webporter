package com.brianway.webporter.data.elasticsearch;

/**
 * Created by brian on 16/12/8.
 */
public class Document {
    protected String id;
    protected String content;

    public Document(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
