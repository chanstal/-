import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sum=0;
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
       sum+=i*(i+1);
        }
        System.out.println(sum);
    }
}