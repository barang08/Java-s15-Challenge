package com.workintech.LibraryProject.Models.Books;


import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Models.Persons.Person;

import java.util.Iterator;

public  class Book {
    private long id;
    private String name;
    private double price;
    private double edition;
    private Person author;
    private boolean isAvailable;
    private StudyBooktype studyBooktype;


    public Book(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.edition = edition;
        this.author = author;
        this.isAvailable = isAvailable;
        this.studyBooktype = studyBooktype;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEdition() {
        return edition;
    }

    public void setEdition(double edition) {
        this.edition = edition;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public StudyBooktype getStudyBooktype() {
        return studyBooktype;
    }

    public void setStudyBooktype(StudyBooktype studyBooktype) {
        this.studyBooktype = studyBooktype;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", edition=" + edition +
                ", author=" + author +
                ", isAvailable=" + isAvailable +
                ", studyBooktype=" + studyBooktype +
                '}';
    }



}
