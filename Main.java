import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       long a=1;
        int m=scn.nextInt();
        for(int i=1;i<=m;i++){

            a=a*i;
        }
        System.out.println(a);}}
