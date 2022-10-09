/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Tommy
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BookManagement bookMn = new BookManagement();
        //sample data
        bookMn.addBook(new Book(1, "Book", "author", "type", "company", 2022));
        bookMn.addBook(new Book(2, "Dynamite", "omg", "candy", "JacknJill", 2020));
        bookMn.addBook(new Book(3, "Dev up", "Nguyen Hien", "IT book", "Spiderum", 2022));
        menuExecute(sc,bookMn);
    }
    public static void menuChoice(){
        System.out.println();
        System.out.println("==========BOOK MANAGEMENT==========");
        System.out.println("""
                           1.Add Books
                           2.Book information
                           3.Find book by name
                           4.Find book by type
                           5.Book publishing this year
                           0.Exit
                           """);
    }
    public static int menuSelection(Scanner sc){
        menuChoice();
        System.out.println("Your Choice ?");
        int choice = sc.nextInt();
        while(choice > 5 || choice < 0){
            System.out.println("""
                                That function isn't support yet !
                                choose again please!
                                """);
            choice = sc.nextInt();
        }
        sc.nextLine();
        return choice;
    }
    public static void menuExecute(Scanner sc,BookManagement bookMana){
        int choice;
        do{
            choice = menuSelection(sc);
            switch(choice){
                case 0 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
                case 1 -> bookMana.enterBooks(sc);
                case 2 -> bookMana.displayBooks();
                case 3 -> bookMana.findBookByName(sc);
                case 4 -> bookMana.findBookByType(sc);
                case 5 -> bookMana.bookpubishingThisYear();
            }
        }while(choice >= 0 && choice <= 5);
    }
    
}
