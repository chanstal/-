import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=n,sum=0,k=0;
        while (i>=1){
            sum+=i%10;
            k++;
            i=i/10;

        }
        System.out.println(k);
        System.out.println(sum);
    }
}
