package ru.mirea.gib04.lab2;

import java.lang.*;
public class Author {
    private String author;
    private String name;
    private int page;
    public Author(String s, int i, String s1) {
        author = "E.L. James";
        name = "50 Shades Of Grey";
        page = 300;
    }
    public Author(int p) {
        author = "George Orwell";
        name = "1984";
        page = p;
    }
    public Author(int p, String n) {
        author = "Dmitriy Glukhovsky";
        name = n;
        page = p;
    }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public String getName() { return name; }
}