import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float n=0.0f;
        float minVal=Float.MAX_VALUE;
        float maxVal=Float.MIN_VALUE;
        for(int i=0;i<10;i++ ){
            n=scn.nextFloat();
            if(n<minVal){
                minVal=n;
            }
            if(n>maxVal){
                maxVal=n;
            }
        }
        System.out.printf("max=%.2f\n",maxVal);
        System.out.printf("min=%.2f\n",minVal);


    }
}
