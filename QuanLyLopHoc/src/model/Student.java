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
public class Student extends User{
    private String background;
    private boolean isOnline;

    public Student() {
    }

    public Student(String name, String gender, LocalDate birthDay, String email, String phoneNumber,String background, boolean isOnline) {
        super(name, gender, birthDay, email, phoneNumber);
        this.background = background;
        this.isOnline = isOnline;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return super.toString()+" background=" + background + ", isOnline=" + isOnline;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }
    
    
   
    
}
