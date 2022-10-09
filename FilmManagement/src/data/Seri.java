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
public class Seri extends Film {
    private int numEps;
    private int aveDuration;

    public Seri() {
    }

    public Seri(String id, String title, String type, String author, double ranking,int numEps, int aveDuration) {
        super(id, title, type, author, ranking);
        this.numEps = numEps;
        this.aveDuration = aveDuration;
    }

    public int getNumEps() {
        return numEps;
    }

    public void setNumEps(int numEps) {
        this.numEps = numEps;
    }

    public int getAveDuration() {
        return aveDuration;
    }

    public void setAveDuration(int aveDuration) {
        this.aveDuration = aveDuration;
    }
    
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter num of episode: ");
        numEps = sc.nextInt();
        System.out.println("Enter average duaration: ");
        aveDuration = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void output(){
        System.out.printf("|%-10s|%-10s|%-20s|%-10s|%-10s|%-10.1f|%-10d|%-10d|\n",
                            "Tv Series",id,title,type,author,ranking,aveDuration,numEps);
    } 
}
