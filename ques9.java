package Assignement;
import java.util.Scanner;

public class ques9 {
    int n;
    int p;
    int facto=1;
    public void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    public void fact(){
        if(n>0){
        while(n>0){
            facto=facto*n;
            n=n-1;
        }
        System.out.println(facto);
}
        
    }
    public static void main(String[] args){
        ques9 i=new ques9();
        i.number();;
        i.fact();
    }

}
