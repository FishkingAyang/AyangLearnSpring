package com.ayang.spring5;

/**
 * @author Ayang
 * @date 2021/3/6 - 14:55
 */
public class Book {
    private String name;
    private String author;
    private User user;
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", user=" + user +
                '}';
    }
}
