package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.AuthorType;
import com.workintech.LibraryProject.Models.Books.Book;

import java.util.List;

public class Author extends Person{

    private AuthorType authorType;

    public Author(String name, AuthorType authorType) {
        super(name);
        this.authorType = authorType;
    }

    public AuthorType getAuthorType() {
        return authorType;
    }

    public void setAuthorType(AuthorType authorType) {
        this.authorType = authorType;
    }


    @Override
    public String toString() {
        return super.getName();
    }

}
