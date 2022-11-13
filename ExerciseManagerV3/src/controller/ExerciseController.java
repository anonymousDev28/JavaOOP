/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.dao.ExerciseDAO;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Exercise;
import view.MainView;

/**
 *
 * @author Tommy
 */
public class ExerciseController {

    private ExerciseDAO eDAO;
    private MainView mainView;

    public ExerciseController(MainView view) {
        this.mainView = view;
        eDAO = new ExerciseDAO();
        view.addListExerciseSelectionListener(new ListExercisesSelectionListener());
    }


    public void showExerciseView() {
        List<Exercise> eList = eDAO.getListExercises();
        mainView.showListExercises(eList);
        mainView.setVisible(true);
    }
    class ListExercisesSelectionListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            mainView.fillExerciseFromSelectedRow();
        }
    }
    //get bai tap bang id
//    public Exercise getExerciseByID(int id){
//        return eDAO.getExerciseByID(id);
//    }
    //kiem tra xem id da ton tai hay chua
//    public boolean isIDExist(int id){
//        for (Exercise exer : eDAO.getListExercises()) {
//            if(exer.getId()==id)
//                return true;
//        }
//        return false;
//    }
    // tra ve Exercise tim theo Title
    public Exercise getExerciseByTitle(String title) {
        for (Exercise e : eDAO.getListExercises()) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        return null;
    }
    //
    public Exercise getExerciseByID(int id) {
        for (Exercise e : eDAO.getListExercises()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
        // tim kiem exercise bang title
    public List<Exercise> searchExercisesByTitle(String title) {
        List<Exercise> result = new ArrayList<>();
        for (Exercise e : eDAO.getListExercises()) {
            if (e.getTitle().contains(title)) {
                result.add(e);
            }
        }
        return result;
    }
}
