/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.StudentManagement;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        sm.addStudents(sc);
        sm.display();
        sm.ratioAbility();
    }
}
