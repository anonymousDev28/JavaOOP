/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.*;

/**
 *
 * @author Tommy
 */
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //test nhap hoc sinh
//        StudentModel sm = new StudentModel();
//        Student s = sm.addStudent(sc);
//        sm.showInforStudent(s);
        //test nhap 1 lop
//        ClassModel cm = new ClassModel();
//        model.Class cTest = cm.addClass(sc);
//        cm.displayInfoClass(cTest);
        //test nhap 1 truong
        SchoolModel schoolModel = new SchoolModel();
        
//          schoolModel.displaySchoolInfo(school);
        menuExecute(sc, schoolModel);
    }
    public static void menuChoice(){
        System.out.println("==========SCHOOL MANAGEMENT==========");
        System.out.println("""
                           1.Nhap danh sach hoc sinh
                           2.Hien thi thong tin tat ca hoc sinh trong lop  
                           3.Hien thi tat ca hoc sinh sinh 1985 va que thai nguyen
                           4.Hien thi ra man hinh hoc sinh lop 10A1
                           0.Exit
                           """);
        System.out.println("Nhap vao lua chon cua ban ?");

    }
    public static int menuSelection(Scanner sc){
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void menuExecute(Scanner sc,SchoolModel sm){
        School school = new School();
        int choice;
        do{
            menuChoice();
            choice = menuSelection(sc);
            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> school = sm.addSchool(sc);
                case 2 -> sm.displaySchoolInfo(school);
                case 3 -> sm.searchByYobAndAddress(school);
                case 4 -> sm.searchByClass(school);
            }
       }while(choice >= 0 && choice <= 4);
    }
}
