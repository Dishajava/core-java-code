import java.util.Scanner;

public class Armstrong {
	static int i,n,temp,c=0;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.printf("enter the value of n is");
		int n=in.nextInt();
		
		temp=n;
		while(n>0)
		{
			i=n%10;
			n=n/10;
			c=c+(i*i*i);
		}
		if(temp==c)
		{
			System.out.println("given numver is armstrong");
		}
		else
			System.out.println("given number is not armstrong");
	}

}
