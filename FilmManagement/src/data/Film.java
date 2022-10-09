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
public class Film {
    protected String id,title,type,author;
    protected double ranking;
    
    public Film() {
    }

    public Film(String id, String title, String type, double ranking) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.ranking = ranking;
    }

    public Film(String id, String title, String type, String author, double ranking) {
        this.id = id;
        this.title = title;
        this.type = type.toUpperCase();
        this.author = author;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void input(Scanner sc){
        System.out.println("Enter id: ");
        id = sc.nextLine();
        System.out.println("Enter title: ");
        title = sc.nextLine();
        System.out.println("Enter type: ");
        type = sc.nextLine();
        System.out.println("Enter author name:");
        author = sc.nextLine();
        System.out.println("Enter ranking: ");
        ranking = sc.nextDouble();
    }
    public void output(){
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10.1f|"
                            ,"Film",id,title,type,author,ranking);
    }
}
