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
public class Exercise implements Serializable {

    private int id;
    private String title;
    private String description;
    private String difficulty;
    private String imgPath;
    private static final long serialVersionUID = 1L;

    public String getImgPath() {
        return imgPath;
    }

    public void setImg(String imgPath) {
        this.imgPath = imgPath;
    }

    public Exercise() {
    }

    public Exercise(int id, String title, String difficulty, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
    }

    public Exercise(int id, String title, String difficulty, String description, String imgPath) {
//        this.id = sID++;
        this.id = id;
        this.title = title;
        this.description = description;
//        this.content = content;
        this.difficulty = difficulty;
        this.imgPath = imgPath;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public boolean compareTwoExercise(Exercise target) {
        return this.title.equals(target.getTitle())
                && this.description.equals(target.getDescription())
                && this.difficulty.equals(target.getDifficulty())
                && this.getImgPath().equals(target.getImgPath());
    }
}
