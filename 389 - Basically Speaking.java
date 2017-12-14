import java.util.*;
public class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=Integer.toString(Integer.parseInt(sc.next(), sc.nextInt()), sc.nextInt());
			if(s.length()>7){
				System.out.println("  ERROR");
			}
			else{
				System.out.format("%7s\n",s.toUpperCase());
			}
		}
	}
}
