package Annotations.Required.Models;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    private Integer bookId;
    private String name;

    @Required
    public Integer getBookId() {
        return bookId;
    }

    @Required
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
