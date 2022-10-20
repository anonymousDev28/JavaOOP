/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Exercise;

/**
 *
 * @author Tommy
 */
public class ExerciseController implements iExerciseController {

    @Override
    public <T> void writeToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            try (FileOutputStream fileOutputStream = new FileOutputStream(file); 
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                 objectOutputStream.writeObject(list);
            }

        } catch (IOException e) {
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                file.createNewFile();
                try (FileInputStream fileInputStream = new FileInputStream(file); 
                     ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                     Object object = objectInputStream.readObject();
                     list = (List<T>) object;
                }

            } catch (IOException | ClassNotFoundException e) {
            }
        }

        return list;
    }

    @Override
    public <T> void sortByTitle(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof Exercise ){
                    Exercise e1 = (Exercise)o1;
                    Exercise e2 = (Exercise)o2;
                    String title1 = e1.getTitle().trim();
                    String title2 = e2.getTitle().trim();
                    return title1.compareTo(title2);
                }
                return 0;
            }
        });
    }

    @Override
    public <T> void sortByDifficulty(List<T> list) {
        list.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof Exercise ){
                    Exercise e1 = (Exercise)o1;
                    Exercise e2 = (Exercise)o2;
                    String dif1 = e1.getDifficulty();
                    String dif2 = e2.getDifficulty();
                    return dif1.compareTo(dif2);
                }
                return 0;
            }
        });
    }
    
}
