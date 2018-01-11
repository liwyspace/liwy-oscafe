package com.liwy.oscafe.common.web.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Article实体类
 * Created by liwy on 2017/3/12.
 */
public class Article implements Serializable {
    private Integer id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String author;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date time;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                '}';
    }
}
