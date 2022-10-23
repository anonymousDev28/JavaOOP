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
public class User{
    private int id;
    private String name;
    private String gender;
    private LocalDate birthDay;
    private String email;
    private String phoneNumber;
    private static int sID = 1000;

    public User() {
    }

    public User(String name, String gender, LocalDate birthDay, String email, String phoneNumber) {
        this.id = ++sID;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge(){
        return LocalDate.now().getYear() - this.birthDay.getYear();
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", gender=" + gender + ", birthDay=" + birthDay +", Age = "+getAge()+ ", email=" + email + ", phoneNumber=" + phoneNumber;
    }
    
    public void displayInfo(){
        System.out.println(toString());
    };

//    @Override
//    public int compareTo(User o) {
//       //em luoi viet qua he 
//       int result = (getAge()>o.getAge())?-1:(getAge()<o.getAge())?1:0;
//       return result;
//    }
    
}
