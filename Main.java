import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=n;
        int count=0;
       while (i>0){
           if(n%i==0)
               count++;
           i--;
       }
       if(count==2)
               System.out.println("Yes");
           else
               System.out.println("No");

       }

}
