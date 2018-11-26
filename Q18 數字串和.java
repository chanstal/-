import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0,k=0;
        while (n>=1){
            sum+=n%10;
            k++;
            n=n/10;

        }
        System.out.println(k);
        System.out.println(sum);
    }
}
