/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tommy
 */
public class School {
    private String course;
    private String term;
    private Class classO;
//    private ArrayList<Class> classes;
    public School() {
        classO = new Class();
        course = "K58";
        term = "2015-2018";
//          classes = new ArrayList<>();
    }

//    public School(String course, String term, ArrayList<Class> classes) {
//        this.course = course;
//        this.term = term;
//        this.classes = classes;
//    }

    public School(String course, String term, Class classO) {
        this.course = course;
        this.term = term;
        this.classO = classO;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Class getClassO() {
        return classO;
    }

    public void setClassO(Class classO) {
        this.classO = classO;
    }

    
    
    
}
