import java.util.Scanner;
public class rev {
    public static void main(String args[]){
        int a;
        int b;
        int temp=0;
        Scanner sc = new Scanner(System.in);              // sc is reference variable
       System.out.println("Enter the first digit");
       a=sc.nextInt();
       Scanner obj = new Scanner(System.in);              // sc is reference variable
       System.out.println("Enter the second digit");
       b=obj.nextInt();
       temp=a;
       a=b;
       b=temp;
       System.out.println("Now First Digit is:"+a);
       System.out.println("Now Second Digit is"+b);
    }  
    
}
