import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int m=0;

        for(int i=1;i<=n/2;i++){
            for (int j=1;j<=n/2;j++){
                sum=(2*i+j)*(j+1)/2;
                if(sum>n)
                    break;
                if(sum==n){
                    for (int k=i;k<i+j;k++){
                        System.out.print(k+"+");
                    }
                    System.out.println(i+j);
                    m=1;
                }
            }
        }
      if(m==0){
          System.out.println("No");
      }
    }
}
