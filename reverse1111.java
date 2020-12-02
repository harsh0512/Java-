import java.util.Scanner;
import java.lang.Math;
public class reverse1111 {
   public static void main(String args[]){
        int num;
        int temp=0;
        int temp2=0;
        int c;          //modules value of num or seperate value of num
        int l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digit:");
        num=sc.nextInt();
        l=(int)(Math.log10(num)+1);          //length of number or number of digits
        while(num>0){
             c=num%10;
             temp=(int)(temp+Math.pow(10,l-1)*c);
             temp2=(int)(temp2+Math.pow(10,l-1));
             num=num/10;
             l=l-1;
        }
            System.out.println(temp+temp2);
    }
}

    

