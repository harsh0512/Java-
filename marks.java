import java.util.Scanner;
public class marks {
    public static void main(String args[]){
        int i;
        
        
        Scanner sc = new Scanner(System.in);              // sc is reference variable
       System.out.println("Enter the number of Subject");
       i=sc.nextInt();
       int[] a=new int[i];
       for(i=0;i<a.length;i++){
        Scanner obj = new Scanner(System.in);              // sc is reference variable
        System.out.println("Enter the marks of Subject"+i);
        a[i]=obj.nextInt();
        
          }
          int per=0;
          int d=i-1;
        while(d>-1){
            per=per+a[d];
            d=d-1;
        }
        System.out.println("Total marks in all Subject"+per);
        int perce;
        int c=i;
        perce=per/(c);
        System.out.println("Percentage is:"+perce);
    }
}
