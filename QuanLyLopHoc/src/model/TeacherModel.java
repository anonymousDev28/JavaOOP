/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class TeacherModel extends UserModel<Teacher>{
    public Teacher addTeacher(Scanner sc){
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Birthday: ");
        LocalDate BirthDay = LocalDate.parse(sc.nextLine());
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Year of experience: ");
        int yearOfExperience = sc.nextInt();
        System.out.println("Speciality: ");
        String speciality = sc.nextLine();
        return new Teacher(name, gender, BirthDay, email, phoneNumber, yearOfExperience, speciality);
    }
//    @Override
//    public void printInfo(Teacher t) {
//        System.out.println(t.toString());
//    }
    
}
