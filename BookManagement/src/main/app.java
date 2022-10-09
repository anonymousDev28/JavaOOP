/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Tommy
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BookManagement bookMn = new BookManagement();
        bookMn.addBook(new Book(1, "Book", "author", "type", "company", 2022));
        bookMn.enterBooks(sc);
        bookMn.displayBooks();
        bookMn.bookpubishingThisYear();
    }
    
}
