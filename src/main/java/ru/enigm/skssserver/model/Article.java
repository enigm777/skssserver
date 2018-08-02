package ru.enigm.skssserver.model;

import java.util.Objects;

/**
 * Simple Java Bean object representing article item
 *
 * @author Ural Nigmatullin
 */
public class Article {

    private String title;
    private String content;
    private String pictureUrl;
    private String publishDate;

    public Article(String title, String content, String pictureUrl, String publishDate) {
        this.title = title;
        this.content = content;
        this.pictureUrl = pictureUrl;
        this.publishDate = publishDate;
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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title) &&
                Objects.equals(content, article.content) &&
                Objects.equals(pictureUrl, article.pictureUrl) &&
                Objects.equals(publishDate, article.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, pictureUrl, publishDate);
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }
}
