/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.*;

/**
 *
 * @author Tommy
 */
public class FilmManagement {
    private final ArrayList<Film> films;

    public FilmManagement() {
        films = new ArrayList<>();
    }
    
    public void addFilm(Film e){
        films.add(e);
    }
    
    public void enterFilms(Scanner sc){
        Film film;
        System.out.println("how many film you wanna add ?");
        int numsFilm = sc.nextInt();
        for (int i = 0; i < numsFilm; i++) {
            System.out.println("""
                               what type film you wanna add ?
                               1.Movie
                               2.Series""");
            System.out.println("enter that type ");
                int choose = sc.nextInt();
                while(choose >2 || choose <1){
                    System.out.println("wrong input ! please enter again");
                    choose = sc.nextInt();
                }
                sc.nextLine();
                System.out.println("Film no "+(i+1));
                switch (choose) {
                        case 1 -> {
                            film = new Movie();
                            ((Movie)film).input(sc);
                            addFilm(film);
                }
                        case 2 -> {
                            film = new Seri();
                            ((Seri)film).input(sc);
                            addFilm(film);
                }
                        default -> {
                }
                    }             
        }

    }

    public void displayFilm(){
        System.out.println("All film we have: ");
            System.out.printf("|%-10s|%-10s|%-20s|%-10s|%-10s|%-10s|%-10s|%-10s|\n"
                                ,"FILM","ID","TITLE","TYPE","AUTHOR","RANKING","DUARATION","EPISODES");
            for (Film filmEle : films) {
                filmEle.output();
            }
        }
    public void searchByTitle(Scanner sc){
        System.out.println("Enter title of film you wanna find ? ");
        String inTitle = sc.nextLine();
        System.out.println("result for keyword: "+inTitle);
        boolean flag = true;
        for (Film filmEle : films) {
                if(inTitle.equals(filmEle.getTitle())){
                    filmEle.output();
                    flag = false;
                }
            }
        if(flag){
            System.out.println("We dont have that film you want !");
        }
    }
    public void thefilmHasLowestRanking(){
        System.out.println("The lowest ranking film is:");
        Film lowestFilm = films.get(0);
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getRanking()>lowestFilm.getRanking()){
                lowestFilm = films.get(i);
            }
        }
        lowestFilm.output();
    }
    public void authorHasTheWorstComedyFilm(){
        ArrayList<Film> comedyFilms = new ArrayList<>();
        for (Film film : films) {
            if("COMEDY".equals(film.getType())){
                comedyFilms.add(film);
            }
        }
        Film lowestComedyFilm = comedyFilms.get(0);
        for (int i = 0; i < comedyFilms.size(); i++) {
            if(comedyFilms.get(i).getRanking()>lowestComedyFilm.getRanking()){
                lowestComedyFilm = comedyFilms.get(i);
            }
        }
        System.out.println("Author has the lowest ranking comedy film is:\n"+lowestComedyFilm.getAuthor()+" with "+lowestComedyFilm.getTitle());
    }
}
