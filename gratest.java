import java.util.Scanner;
public class gratest {
    public static void main(String args[]){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);              // sc is reference variable
       System.out.println("Enter the First number:");
       a=sc.nextInt();
       System.out.println("Enter the Second number:");
       b=sc.nextInt();
       System.out.println("Enter the Third number:");
       c=sc.nextInt();
       if(a>b && a>c){
           System.out.println("First is greatest");
       }
       else if(b>a && b>c){
        System.out.println("Second is greatest");
       }
       else {
        System.out.println("Third is greatest");
       }

    }
}
