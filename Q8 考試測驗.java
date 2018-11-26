import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int a,b,c,k;
	for(int i=0;i<=n;i++){
		k=0;
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		if(a<60){
			k++;
		}
		if(b<60){
			k++;
		}
		if(c<60){
			k++;
		}
		if(k==0){
			System.out.println("P");
		}
		else if(k==1){
			if(a+b+c>=220) {
				System.out.println("P");
			}
			else{
				System.out.println("M");

				}

		}
		else if(k==2){
			if(a>=80||b>=80||c>=80){
				System.out.println("M");
			}
			else {
				System.out.println("F");
			}
		}

		else{
			System.out.println("F");
		}
	}

    }
}
