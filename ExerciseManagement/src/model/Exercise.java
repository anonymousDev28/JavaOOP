/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Tommy
 */
public class Exercise implements Serializable{
    private int id;
    private String title;
    private String Description;
    private String content;
    private String difficulty;
    private static int sID = 10000;

    public Exercise() {
    }

    public Exercise(String title, String Description, String content, String difficulty) {
        this.id = sID++;
        this.title = title;
        this.Description = Description;
        this.content = content;
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public static int getsID() {
        return sID;
    }

    public static void setsID(int sID) {
        Exercise.sID = sID;
    }
    
}
