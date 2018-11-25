import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        short v = scn.nextShort();
        int tmp;
        String str = "";
        if(v < 0){
            tmp = 128 + v;
        }
        else{
            tmp = v;
        }
        while(tmp >1){
            str = Integer.toString(tmp %2) + str;
            tmp /= 2;
        }
        str = Integer.toString(tmp) + str;
        int leng = str.length();
        for(int i = 0; i < 7-leng; i++){
            str ="0" + str;
        }
        if(v <0 ){
            str ="1" + str;
        }
        else{
            str ="0" + str;
        }
        System.out.println(str);
    }}
