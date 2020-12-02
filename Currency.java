import java.util.Scanner;
public class Currency {
    public static void main(String args[]){
    int rs=0, one=0, two=0, five=0, ten=0, fifty=0, hundred=0;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Amount:");
    rs=sc.nextInt();
    if(rs>=100)
    {
        hundred = rs/100;
        rs = rs%100;
    }

    if(rs>=50)
    {
        fifty = rs/50;
        rs = rs%50;
    }

    if(rs>=10)
    {
        ten = rs/10;
        rs = rs%10;
    }
    if(rs>=5)
    {
        five = rs/5;
        rs = rs%5;
    }
    if(rs>=2)
    {
        two = rs/2;
        rs = rs%2;
    }
    if(rs>=1)
    {
        one = rs;
    }
    System.out.println("Number of 100 Rupees Notes" + hundred);
    System.out.println("Number of 50 Rupees Notes" + fifty);
    System.out.println("Number of 10 Rupees Notes" + ten);
    System.out.println("Number of 5 Rupees Notes" + five);
    System.out.println("Number of 2 Rupees Notes" + two);
    System.out.println("Number of 1 Rupees Notes" + one);
    }
}
