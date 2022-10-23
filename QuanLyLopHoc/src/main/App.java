/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import model.ClassManager;

/**
 *
 * @author Tommy
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new  Scanner(System.in);
        ClassManager cm = new ClassManager();
        cm.display();
        cm.searchByKeyword(sc);
        cm.sortByAgeDes();
        cm.sortByNameAZ();
    }
    
}
