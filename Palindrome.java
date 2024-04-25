import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//123->321
		int num=sc.nextInt();
		int r=0;
		int temp=num;
		while(num>0){
		    int value=num%10;//123%10=3, 12%10=2 ,1
		    r=r*10+value;
		    num=num/10;//123/10=12 ,1
		    }
	if(temp==r){
	    System.out.print("Palindrome");
	}
	else{
	    System.out.print("Not palindrome");
	}
	}
}

