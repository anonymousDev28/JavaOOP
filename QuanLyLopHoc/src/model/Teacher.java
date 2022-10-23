/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Tommy
 */
public class Teacher extends User {
    private int yearOfexperience;
    private String speciality;

    public Teacher() {
    }

    public Teacher(String name, String gender, LocalDate birthDay, String email, String phoneNumber,int yearOfexperience, String speciality) {
        super(name, gender, birthDay, email, phoneNumber);
        this.yearOfexperience = yearOfexperience;
        this.speciality = speciality;
    }

    public int getYearOfexperience() {
        return yearOfexperience;
    }

    public void setYearOfexperience(int yearOfexperience) {
        this.yearOfexperience = yearOfexperience;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString()+" yearOfexperience=" + yearOfexperience + ", speciality=" + speciality;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }
    
    
}
