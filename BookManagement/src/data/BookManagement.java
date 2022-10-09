/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class BookManagement {
    private final ArrayList<Book> manaBook;

    public BookManagement() {
        manaBook = new ArrayList<>();
    }
    
    public void addBook(Book o){
        manaBook.add(o);
    }
    
    public void enterBooks(Scanner sc){
        Book book;
        System.out.println("How many book you wanna add ?");
        int numBooks = sc.nextInt();
        for (int i = 0; i < numBooks; i++) {
            book = new Book();
            book.input(sc);
            addBook(book);
        }
    }
    public void displayBooks(){
        for (Book book : manaBook) {
            book.output();
        }
    }
    public void findBookByName(Scanner sc){
        System.out.println("Enter name of book you wanna find ? ");
        String inBook = sc.nextLine();
        System.out.println("Result for keyword: "+inBook);
        for (Book book : manaBook) {
            if(book.getName().equals(inBook));
            else{
                System.out.println("We dont have that book name: "+inBook);
              }
        }
    }
    public void findBookByType(Scanner sc){
        System.out.println("Enter type of book you wanna find ? ");
        String inType = sc.nextLine();
        System.out.println("Result for keyword: "+inType);
        for (Book book : manaBook) {
            if(book.getType().equals(inType)){
                book.output();
            }else{
                System.out.println("We dont have type: "+inType);
              }
        }
    }
    public void bookpubishingThisYear(){
        int thisYear = LocalDate.now().getYear();
        System.out.println("This year: "+thisYear);
        System.out.println("Book publishing this year: ");
        for (Book book : manaBook) {
            if(book.getPublishingYear() == thisYear){
                book.output();
            }else{
                System.out.println("We dont have any book publishing this year ");
            }
        }
    }
    
}
