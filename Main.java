import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p;
        int k;
        for(int i=1;i<n;i++){
            p=i;
            k=0;
            while (p>0) {
                if (i % p == 0)
                    k++;
                p--;
            }
                if(k==2){
                    System.out.println(i);

            }


        }

    }
}