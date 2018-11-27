import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0,i=0;
        while (sum<=n){   
            i++;
            sum+=i;
         
        }
        System.out.println(i-1);
    }
}
