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
public class Movie extends Film {
    private int duration;

    public Movie() {
    }

    public Movie(String id, String title, String type,String author, double ranking,int duration) {
        super(id, title, type, author, ranking);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter duration");
        duration = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void output(){
        System.out.printf("|%-10s|%-10s|%-20s|%-10s|%-10s|%-10.1f|%-10d|\n",
                            "Movie",id,title,type,author,ranking,duration);
    }
    
    
}
