/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.comparator;

import java.util.Comparator;
import model.User;

/**
 *
 * @author Tommy
 */
public class NameComparator implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
