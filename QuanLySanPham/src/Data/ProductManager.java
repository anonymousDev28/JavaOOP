package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        products.add(new Product("Bottle Water","Drink",100,80000,"bottle"));
        products.add(new Product("Donut","Eat",200,150000,"box"));
        products.add(new Product("Rice","Cook",500,43000,"kg"));
        products.add(new Product("volka","Drink",100,120000,"bottle"));
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    public void displayListProduct(){
        System.out.println("List product: ");
        for (Product p:products) {
            System.out.println(p.toString());
        }
    }
    public void searchByName(Scanner sc){
        System.out.println("Enter name: ");
        String nameX = sc.nextLine();
        System.out.println("Result for "+nameX);
        boolean flag = true;
        for (Product p:products) {
            if(p.getName().equals(nameX)){
                flag = false;
                System.out.println(p.toString());
            }
        }
        if (!flag){
            System.out.println("We dont have "+nameX);
        }
    }
    // tim san pham bang id va thay doi theo tuy chon
    public void searchByID(Scanner sc){
        System.out.println("Enter ID: ");
        int idX = Integer.parseInt(sc.nextLine());
        System.out.println("Result for "+idX);
        boolean flag = true;
        for (Product p:products) {
            if(p.getId()==idX){
                flag = false;
                System.out.println(p.toString());
                System.out.println("1.delete");
                System.out.println("2.change amount");
                System.out.println("Your choice ?");
                int choice = Integer.parseInt(sc.nextLine());
                if(choice == 1){
                    products.remove(p);
                }else if (choice == 2){
                    System.out.println("Just enter amount you wanna change :");
                    p.setAmount(Integer.parseInt(sc.nextLine()));
                }
                break;
            }
        }
        if (flag){
            System.out.println("We dont have ID: "+idX);
        }else{
            System.out.println("List product after change: ");
            for (Product p:products) {
                System.out.println(p.toString());
            }
        }
    }
    // san pham co so luong duoi 5
    public void amountUnder5(){
        System.out.println("Result:");
        boolean flag = true;
        for (Product p:products) {
            if(p.getAmount()<5){
                flag = false;
                System.out.println(p.toString());
            }
        }
        if (flag){
            System.out.println("We dont have any product what have amount under 5");
        }
    }
    // tim san pham theo muc gia
    public void searchByPrice(Scanner sc){
//        System.out.println("Enter price: ");
//        int price = Integer.parseInt(sc.nextLine());
        System.out.println("""
                                1.Under 50.000 dong
                                2.Under 100.000 dong
                                3.From 100.000 dong
                                what is your choice ?
                """);
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1){
            for (Product p:products) {
                if(p.getPrice()<50000){
                    System.out.println(p.toString());
                }
            }
        }else if(choice == 2){
            for (Product p:products) {
                if(p.getPrice()<100000&&p.getPrice()>=50000){
                    System.out.println(p.toString());
                }
            }
        }else{
            for (Product p:products) {
                if(p.getPrice()>=100000){
                    System.out.println(p.toString());
                }
            }
        }
    }

}
