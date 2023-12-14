package com.workintech.LibraryProject.Models.Library;

import com.workintech.LibraryProject.Models.Books.Book;

import java.util.*;

public class Library {
    Map<Long,Book> bookList = new HashMap<>();

     Map<String, String> borrowedBooks  = new HashMap<>();

    public Map<Long, Book> getBookList() {
        return bookList;
    }

    public void setBookList(Map<Long, Book> bookList) {
        this.bookList = bookList;
    }

    public Map<String, String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Map<String, String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    /*public boolean borrowBook(String bookName, String userName) {
        if (bookList.contains(bookName) && !borrowedBooks.containsKey(bookName)) {
            borrowedBooks.put(bookName, userName);
            return true; // Kitap başarıyla ödünç alındı
        }
        return false; // Kitap zaten ödünç alındı veya kütüphanede yok
    }
*/
    public boolean returnBook(String bookName) {
        if (borrowedBooks.containsKey(bookName)) {
            borrowedBooks.remove(bookName);
            return true; // Kitap başarıyla iade edildi
        }
        return false; // Kitap zaten iade edildi veya ödünç alınmamış
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
