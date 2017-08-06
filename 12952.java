import java.util.*;
import java.io.*;
public class Main
{
    
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==b)
				System.out.println(a);
			else
				System.out.println(Math.max(a,b));
		}
	}
	
}
