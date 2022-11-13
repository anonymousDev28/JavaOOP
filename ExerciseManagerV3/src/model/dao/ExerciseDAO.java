/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Exercise;

/**
 *
 * @author Tommy
 */
public class ExerciseDAO {

    // <editor-fold defaultstate="collapsed" desc="Default Data">
    private static List<Exercise> exercises = new ArrayList<>(Arrays.asList(
            new Exercise(1, "Two Sum", "Easy", "Easy Array List", "/model/img/diagram2.jpg"),
            new Exercise(2, "quản lý nhân viên", "Easy", """
                                                         Hãy thiết kế và viết code của chương trình trên 
                                                         làm sao để tuân thủ theo đúng mô hình OOP đã học,
                                                         áp dụng đầy đủ 4 tính chất : bao đóng (encapsulation) ,
                                                         kế thừa (inheritance) , đa hình (polymorphism) ,
                                                         trừu tượng (abstraction).
                                                         """
                    + "", "/model/img/diagram1.jpg"),
            new Exercise(3, "Quản lý trận đấu xếp hạng", "Easy","""
                                                                Quản lý trận đấu xếp hạng 
                                                                - Class: SummonRift: List<Team>
                                                                - 1 trận đấu LOL gồm 2 teams và thời gian bắt đầu trận đấu
                                                                Note: 
                                                                Mỗi team 5 người(5 tướng – figure)
                                                                Mỗi vị tướng sẽ bao gồm các thuộc tính: name, position
                                                                Yêu cầu: nhập thông tin cho 2 teams
                                                                và hiển thị thông tin của 2 team ấy
                                                                """, "/model/img/lol.jpg"),
            new Exercise(4, "Quản lý Tiktok", "Easy","""
                                                     Tạo lớp Tiktok: các idols, các bài hát(Songs)
                                                     Tạo 1 lớp Idol: name, id, email, followers,
                                                     (String) group
                                                     Follower: name, id, email,(int) numberOfLike
                                                     Song: Id, name,(String) singer
                                                     -> Yêu cầu: Nhập và hiển thị thông tin của các object trên
                                                     ""","/model/img/tiktok.jpg"),
            new Exercise(5, "interface đa giác Polygon", "Medium", """
                                                                   Tạo interface đa giác Polygon: void display(), void calArea()
                                                                   Tạo lớp Rectangle: (double) length, (double) width
                                                                   Tạo lớp Square: (double) side
                                                                   Cho 2 lớp trên implements interface Polygon
                                                                   để thực hiện hiển thị thông tin và tính diện tích
                                                                   ""","/model/img/polygon.jpg"),
                                                                                                                                 
            new Exercise(6, "Worker Manager", "Hard", """
                                                      Tạo lớp Worker: id, name, age, salary, workPlace
                                                      Thực hiện thêm mới một công nhân
                                                      Thực hiện tăng lương, giảm lương cho các công nhân
                                                      Hiển thị menu cho người dùng chọn
                                                      """, "/model/img/worker.jpg")));
    // </editor-fold>

    public ExerciseDAO() {
        
    }
    // them exercise vao list exercise
    public void add(Exercise exercise) {
        int id = (!exercises.isEmpty()) ? (exercises.size() + 1) : 1;
        
        while(isIDExist(id)){
            id++;
        }
        exercise.setId(id);
        exercises.add(exercise);
    }
    // sua exercise trong list exercise
    public void edit(Exercise exercise) {
        int size = exercises.size();
        for (int i = 0; i < size; i++) {
            if (exercises.get(i).getId() == exercise.getId()) {
                exercises.get(i).setTitle(exercise.getTitle());
                exercises.get(i).setDifficulty(exercise.getDifficulty());
                exercises.get(i).setDescription(exercise.getDescription());
                break;
            }
        }
    }
    // xoa exercise trong list exercise
    public boolean delete(Exercise e) {
        boolean isFound = false;
        int size = exercises.size();
        for (int i = 0; i < size; i++) {
            if (exercises.get(i).getId() == e.getId()) {
                exercises.remove(i);
                isFound = true;
                break;
            }
        }
        return isFound;
    }
    // tra ve list exercise
    public List<Exercise> getListExercises() {
        return exercises;
    }
    public void setListExercises(List<Exercise> listExercises) {
        this.exercises = listExercises;
    }
    public boolean isIDExist(int id){
        for (Exercise exer : exercises) {
            if(exer.getId()==id)
                return true;
        }
        return false;
    }
    
    

}
