package main;

import Data.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        menuExecute(sc,productManager);
    }
    public static void menuChoice(){
        System.out.println("==========PRODUCT MANAGEMENT==========");
        System.out.println("""
                           1.Xem danh sách sản phẩm
                           2.Tìm sản phẩm theo tên 
                           3.Tìm sản phẩm theo id:
                                3.1 Xóa sản phẩm
                                3.2 Cập nhật số lượng
                           4.Tìm các sản phẩn có số lượng dưới 5
                           5.Liệt kê sản phẩm theo mức giá
                           0.Exit
                           """);
        System.out.println("Your Choice ?");

    }
    public static int menuSelection(Scanner sc){
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void menuExecute(Scanner sc,ProductManager manager){
        int choice;
        do{
            menuChoice();
            choice = menuSelection(sc);
            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> manager.displayListProduct();
                case 2 -> manager.searchByName(sc);
                case 3 -> manager.searchByID(sc);
                case 4 -> manager.amountUnder5();
                case 5 -> manager.searchByPrice(sc);
            }
        }while(choice >= 0 && choice <= 5);
    }
}


