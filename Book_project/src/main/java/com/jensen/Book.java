package com.jensen;

public class Book {
    private String title;
    private Integer pages;
    private String author;

    public Book(String title, Integer pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        if(title == null)
        {
            return;
        }
        if(title.length() ==0 )
        {
            throw new IllegalArgumentException("Title most include characters");
        }
        this.title = title;
    }

    public Integer getPages()
    {
        return pages;
    }

    public void setPages(Integer pages)
    {
        if(pages < 0)
        {
            throw new IllegalArgumentException("Pages can't be negative");
        }
        this.pages = pages;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
}
