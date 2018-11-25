import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	int n=a,m=b,k=0;
	if(n<m){
	    int x=n;
	    n=m;
	    m=x;
    }
    while(m>0) {
        k = m;
        m = n % m;
        n = k;
    }
        System.out.println(n);
        System.out.println((a*b)/n);
    }

    }

