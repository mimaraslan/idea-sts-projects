package com.ahmetakkoyun;

import java.util.*;
public class Document {

    private String[] authors;
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthor(String name){
        System.out.println("Author name");
    }
}
