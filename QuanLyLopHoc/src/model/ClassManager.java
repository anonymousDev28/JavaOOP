/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.comparator.AgeComparator;
import model.comparator.NameComparator;

/**
 *
 * @author Tommy
 */
public class ClassManager {

    //chi dung 1 mang de luu
    private ArrayList<User> users;
    private StudentModel sm;
    private TeacherModel tm;

    public ClassManager() {
        users = new ArrayList<>();
        users.add(new Student("Quang", "Male", LocalDate.parse("2000/05/03", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", "student", false));
        users.add(new Student("Ha", "Female", LocalDate.parse("2000/08/09", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", "student", true));
        users.add(new Teacher("Dat", "Male", LocalDate.parse("1995/15/09", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "BE Java"));
        users.add(new Teacher("Huong", "Female", LocalDate.parse("1990/15/09", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "HR"));
        users.add(new Teacher("Thinh", "Male", LocalDate.parse("1995/17/03", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "FE"));
        users.add(new Teacher("Cuong", "Male", LocalDate.parse("1992/23/06", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "Full Stack"));
        users.add(new Teacher("Quang", "Male", LocalDate.parse("1993/20/10", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "Full Stack"));
        users.add(new Teacher("Quang2", "Male", LocalDate.parse("1980/29/10", DateTimeFormatter.ofPattern("yyyy/dd/MM")), "mquangdw20@gmail.com", "0858422186", 3, "Full Stack"));
        sm = new StudentModel();
        tm = new TeacherModel();
    }

    // duyet mang su dung display infor ung voi tung loai user
    public void display() {
        System.out.println("-------------------------------");
        System.out.println("All our user we store:");
        for (User user : users) {
            user.displayInfo();
        }
    }

    //tim kiem theo keyword bat ki
    public void searchByKeyword(Scanner sc) {
        System.out.println("Enter keyword");
        String keyword = sc.nextLine();
        System.out.println("-------------------------------");
        System.out.println("Result for " + keyword);
        if (searchByName(keyword) != null) {
            System.out.println(searchByName(keyword).toString());
        } else if (searchByEmail(keyword) != null) {
            System.out.println(searchByEmail(keyword).toString());
        } else if (searchByPhoneNumber(keyword) != null) {
            System.out.println(searchByPhoneNumber(keyword).toString());
        } else {
            System.out.println("Nope!");
        }

    }

    public User searchByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User searchByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User searchByPhoneNumber(String num) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(num)) {
                return user;
            }
        }
        return null;
    }

    //sap xep theo tuoi giam dan
    public void sortByAgeDes() {
        Collections.sort(users, new AgeComparator());
        System.out.println("-------------------------------");
        System.out.println("Sort by Age descending...");
        for (User user : users) {
            user.displayInfo();
        }
    }

    // sap xem theo ten
    public void sortByNameAZ() {
        Collections.sort(users, new NameComparator());
        System.out.println("-------------------------------");
        System.out.println("Sort By Name A-Z...");
        for (User user : users) {
            user.displayInfo();
        }
    }

}
