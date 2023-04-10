package com.mirea.kt.example;
import java.io.*;

public class Message implements Serializable
{
    private static final long serialVersionUID = -3380157693869190848L;
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp)
    {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }

    public int getId() {return id;}

    public String getBody() {
        return body;
    }

    public String getType() {
        return type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", type='" + type + '\'' +
                ", hasAttachments=" + hasAttachments +
                ", timestamp=" + timestamp +
                '}';
    }
}

