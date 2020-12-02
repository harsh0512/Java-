package Assignement;

import java.util.Scanner;

public class ques10 {
    
    public static void main(String[] args)
    {
        int n;
    double hm = 0.0;
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
     
     
       
             while(n>0){
                hm=hm+(double)(1/n);
                n=n-1;
                
             }
             System.out.println(hm);
            }
        
     
        }

