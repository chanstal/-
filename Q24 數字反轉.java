import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    long n=scn.nextLong();
        while (n>0){
            System.out.print(n%10);
            n=n/10;
        }
        System.out.println();
    }
}
