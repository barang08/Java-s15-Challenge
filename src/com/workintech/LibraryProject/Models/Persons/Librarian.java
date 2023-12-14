package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Interfaces.LibrarianMethods;
import com.workintech.LibraryProject.Models.Books.Book;
import com.workintech.LibraryProject.Models.Library.Library;

import java.util.Iterator;
import java.util.Map;

public class Librarian extends Person implements LibrarianMethods {
    private Library library;

    public Librarian(String name, Library library) {
        super(name);
        this.library = library;
    }


    public void listBookNames() {
        for (Book book : library.getBookList().values()) {
            System.out.println(book.getName());
        }
    }


    @Override
    public void addBook(Book book) {
        library.getBookList().put(book.getId(),book);
        System.out.println(book.getName() + " " + " Kitabı başarılı bir şekilde kütüphanemize eklenmiştir. ");
    }
    @Override
    public void deleteBook(long id) {
        Map<Long, Book> bookList = library.getBookList();
        boolean found = false;

        for (Map.Entry<Long, Book> entry : bookList.entrySet()) {
            if (entry.getValue().getId() == id) {
                bookList.remove(entry.getKey());
                System.out.println(entry.getValue().getName() + " isimli kitap sistemimizden kaldırıldı.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sistemde aradığınız ID'ye sahip bir kitap bulunamadı.");
        }
    }


    @Override
    public void searchBook(String bookName) {
        Iterator<Book> iterator = library.getBookList().values().iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getName().equalsIgnoreCase(bookName)) {
                System.out.println("Aradığınız kitap bulundu: " + book.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Üzgünüm, aradığınız kitap sistemimizde bulunmamaktadır.");
        }
    }

    @Override
    public void editBook(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype) {
        for(Book books: library.getBookList().values()){
            if(books.getId() == id){
                books.setName(name);
                books.setPrice(price);
                books.setEdition(edition);
                books.setAuthor(author);
                books.setAvailable(isAvailable);
                books.setStudyBooktype(studyBooktype);
                System.out.println("Kitap güncelleme işlemi başarı ile tamamlandı.");

            }

        }
    }
    @Override
    public String toString() {
        return "Librarian{" +
                "library=" + library +
                '}';
    }
}






