import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String s=sc.nextLine();
			if(s.charAt(0)=='_'){
				continue;
			}
		    s=s.replaceAll("[|.]","");
			s=s.replaceAll("o","1");
		    s=s.replaceAll(" ","0");
			System.out.print((char)Integer.parseInt(s,2));
		}
	}
}
