/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import data.*;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class mainSolution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilmManagement filmMana = new FilmManagement();
        // sample data 
        Film e1 = new Movie("1", "Peaky Blinders", "action", "Eran", 2, 180);
        Film e2 = new Movie("2", "Batman vs Superman", "action", "Trox", 180, 90);
        Film e3 = new Movie("4", "The Walking Dead", "comedy", "Dave", 8, 180);
        Film e4 = new Movie("5", "Rocky", "nah", "Chappell", 400, 100);
        Film e5 = new Movie("3", "Squid Game", "comedy", "Andy", 92, 60);
        Film s1 = new Seri("6", "The Witcher", "action", "Quang", 1, 6, 90);
        filmMana.addFilm(e1);
        filmMana.addFilm(e2);
        filmMana.addFilm(e3);
        filmMana.addFilm(e4);
        filmMana.addFilm(e5);  
        filmMana.addFilm(s1);
        menuExecute(sc,filmMana);
    }
    public static void menuChoice(){
        System.out.println("==========FILM MANAGEMENT==========");
        System.out.println("""
                           1.Add film
                           2.Film information 
                           3.Search film by title
                           4.Film has the lowest ranking
                           5.The author has the lowest ranking comedy film
                           0.Exit
                           """);
    }
    public static int menuSelection(Scanner sc){
        System.out.println("Your Choice ?");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void menuExecute(Scanner sc,FilmManagement filmMana){
            int choice;
            menuChoice();
        do{
            choice = menuSelection(sc);
            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> filmMana.enterFilms(sc);
                case 2 -> filmMana.displayFilm();
                case 3 -> filmMana.searchByTitle(sc);
                case 4 -> filmMana.thefilmHasLowestRanking();
                case 5 -> filmMana.authorHasTheWorstComedyFilm();
            }
       }while(choice >= 0 && choice <= 5);
    }
}
