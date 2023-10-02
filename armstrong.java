package practise;
import java.util.*;
public class armstrong {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num,product=1,sum=0,count=0,last=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		 num=temp;
		while(num!=0) {
			product=1;
			last=num%10;
		for(int i=1;i<=count;i++) {
			product=product*last;
		}
			sum=sum+product;
			num=num/10;
			}
		if(temp==sum) {
			System.out.println("the num is armstrong");
			}
		else {
			System.out.println("the num is not armstrong");
		}
	}
}
