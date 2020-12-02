package Assignement;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args){
        int p;
        int r;
        int t;
        float SI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        p=sc.nextInt();
        System.out.println("Enter the Rate");
        t=sc.nextInt();
        System.out.println("Enter the Time");
        r=sc.nextInt();
        SI=(p*r*t)/100;
        System.out.println("Simple interest of input Data is"+":"+SI);
    }
    
}
