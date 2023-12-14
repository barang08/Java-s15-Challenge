package com.workintech.LibraryProject.Models.Invoice;

import com.workintech.LibraryProject.Enums.MemberTypes;

public class Invoice {

    private String bookName;
    private String authorName;
    private String memberName;
private MemberTypes memberTypes;
private double totalPrice;

    public Invoice(String bookName, String authorName, String memberName, MemberTypes memberTypes, double totalPrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.memberName = memberName;
        this.memberTypes = memberTypes;
        this.totalPrice = totalPrice;
    }
    public void  invoiceDetails(){
        System.out.println("Fatura Detayı:");
        System.out.println("Kitap Adı:" + bookName);
        System.out.println("Yazar Adı:" + authorName);
        System.out.println("Alıcı Adı:" + memberName);
        System.out.println("Alıcı Ünvanı:" + memberTypes);
        System.out.println("Ödenen Tutar:" + totalPrice+ " " + "TL");
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberTypes=" + memberTypes +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
