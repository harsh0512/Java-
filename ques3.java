package Assignement;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args)
    {
        int n;
        int d;
       int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=obj.nextInt();
        while(n>0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
         System.out.println(sum);
        }
    }

