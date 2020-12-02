package Assignement;

import java.util.Scanner;
public class ques7 {
    public static void main(String[] args){
        int rad;
        double PI=3.14;
        double dia;
        double area;
        double cir;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        rad=obj.nextInt();
        dia=2*PI*rad;
        area=PI*rad*rad;
        cir=2*PI*rad;
        System.out.println("Diameter of Circle:"+" "+dia);
        System.out.println("Area of Circle:"+" "+area);
        System.out.println("Circumstance of Circle:"+" "+cir);
    }

}