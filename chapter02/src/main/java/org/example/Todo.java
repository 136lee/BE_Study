package org.example;

public class Todo {

    private String content;
    private long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content=content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public Todo(long id, String content) {
        this.id=id;
        this.content=content;
    }
}