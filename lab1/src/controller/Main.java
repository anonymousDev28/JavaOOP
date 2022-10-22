/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import model.StudentManagement;

/**
 *
 * @author Tommy
 */
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StudentManagement sm = new StudentManagement();
       String choice;
       do{   
            sm.addStudent(sc);
            System.out.println("Do you want add more ?(Y/N)");
            choice = sc.nextLine();
       }while("Y".equals(choice));
       sm.display();
    }
}
