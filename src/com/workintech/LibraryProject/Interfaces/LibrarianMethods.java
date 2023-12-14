package com.workintech.LibraryProject.Interfaces;

import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Models.Books.Book;
import com.workintech.LibraryProject.Models.Persons.Person;

public interface LibrarianMethods {
void addBook(Book book);
void searchBook(String name);
void deleteBook(long id);
void editBook(long id, String name, double price, double edition,
              Person author, boolean isAvailable, StudyBooktype studyBooktype);




}
