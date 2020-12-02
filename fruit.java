package Assignement;
import java.util.Scanner;
public class fruit {
    int price;
    String name;
    int qunat;
    public void setData()
    {
       Scanner sc = new Scanner(System.in);              // sc is reference variable
       System.out.println("Enter name of fruit:");
       name=sc.nextLine();
       System.out.println("Enter Quantity of Fruits: ");
       qunat = sc.nextInt();
       System.out.println("Enter Price of Fruits");        ///encapsulation
       price = sc.nextInt();
    }
    public void displayFruit(){
        System.out.println(name); 
        System.out.println(qunat); 
        System.out.println(price); 
    }
    public static void main(String[] args)
       {
          fruit i = new fruit(); 
          i.setData();
          i.displayFruit();
 }
    
}
