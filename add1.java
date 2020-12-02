import java.util.Scanner;
import java.lang.Math;
public class add1 {
   public static void main(String args[]){
        int num;
        int temp2=0;
                 
        int l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digit:");
        num=sc.nextInt();
        l=(int)(Math.log10(num)+1);          //length of number or number of digits
        while(l>-1){
             temp2=(int)(temp2+Math.pow(10,l-1));
             l=l-1;
        }
            System.out.println(num+temp2);
    }
}

    

