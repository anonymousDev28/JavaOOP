/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Tommy
 */
public class Student {
    private int id;
    private static int sID = 1000;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student() {
    }

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = ++sID;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
    // tinh diem trung binh
    public double getAvg(){
        return (scoreMath+scoreChemistry+scorePhysic)/3;
    }
    // xep hang hoc luc
    public String getAcademicPerformance(){
        if(getAvg()>=8){
            return "A";
        }else if(getAvg()>=6.5){
            return "B";
        }else{
            return "C";
        }
    }
    public void display(){
        System.out.printf("|STUDENT|%-10s|%-10s|%-10.1f|%-10s|\n",id,name,getAvg(),getAcademicPerformance());
    }
}
