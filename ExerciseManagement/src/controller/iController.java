/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;

/**
 *
 * @author Tommy
 */
public interface iController {
    <T> void writeToFile(List<T> list,String fileName);
    <T> List<T> readDataFromFile(String fileName);
    <T> void sortByName(List<T> list);
    <T> void sortByLisence(List<T> list);
}
