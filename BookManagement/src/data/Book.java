/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class Book {
    private int id;
    private String name,author,type,publishingCompany;
    private int publishingYear;

    public Book() {
    }

    public Book(int id, String name, String author, String type, String publishingCompany, int publishingYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    
    public void input(Scanner sc){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter author name:");
        author = sc.nextLine();
        System.out.println("Enter type: ");
        type = sc.nextLine();
        System.out.println("Enter publishing copmany: ");
        publishingCompany = sc.nextLine();
        System.out.println("Enter publishing year: ");
        publishingYear = sc.nextInt();
    }
    public void output(){
        System.out.printf("|%-10s|%-10d|%-10s|%-10s|%-10s|%-10s|%-10d|\n"
                            ,"BOOK",id,name,author,type,publishingCompany,publishingYear);
    }
}
