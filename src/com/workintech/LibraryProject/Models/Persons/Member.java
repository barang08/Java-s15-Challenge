package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.MemberTypes;
import com.workintech.LibraryProject.Models.Books.Book;
import com.workintech.LibraryProject.Models.Invoice.Invoice;
import com.workintech.LibraryProject.Models.Library.Library;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person{
    private long number;
    private String password;
    private String email;
    private MemberTypes memberTypes;
    private List<Book> borrowedList;
    private List<Invoice> invoices;
    private Library library;



    public Member(String name, MemberTypes memberTypes) {

        super(name, memberTypes);
        this.borrowedList = new ArrayList<>();
        this.invoices = new ArrayList<>();
        this.memberTypes = memberTypes;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public MemberTypes getMemberTypes() {
        return memberTypes;
    }

    @Override
    public void setMemberTypes(MemberTypes memberTypes) {
        this.memberTypes = memberTypes;
    }

    public List<Book> getBorrowedList() {
        return borrowedList;
    }

    public void setBorrowedList(List<Book> borrowedList) {
        this.borrowedList = borrowedList;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public boolean login(long number, String password){
        if(this.number == number && this.password.equals(password)){
            System.out.println("Hoşgeldin:" + getName());
            return true;

        }else{
            System.out.println("Hatalı numara veya şifre girdiniz! Tekrar deneyin");
            return false;

        }
    }

    public boolean borrowBook(Book book) {
        if (borrowedList.size() >= 5) {
            System.out.println("Kitap  alma sınırı max 5 adet olduğundan daha fazla kitap  ödünç alamazsınız.");
            return false;
        }
        Invoice invoice = new Invoice(book.getName(), book.getAuthor().getName(), this.getName(), this.getMemberTypes(), book.getPrice());
        invoice.invoiceDetails();
        invoices.add(invoice);
        borrowedList.add(book);
        System.out.println(book.getName() + " kitabı ödünç alındı.");
        return true;
    }

    public boolean returnBook(Book book) {
        if (borrowedList.contains(book)) {
            Invoice invoice = new Invoice(book.getName(), book.getAuthor().getName(), this.getName(), this.getMemberTypes(), -book.getPrice());
            invoice.invoiceDetails();
            invoices.add(invoice);
            borrowedList.remove(book);
            System.out.println(book.getName() + " kitabı iade edildi.");
            return true;
        } else {
            System.out.println("Bu kitap ödünç alınmamış.");
            return false;
        }
    }







}
