import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int testcase=Integer.parseInt(sc.nextLine());
		for(int i=0;i<testcase;i++){
			String a=sc.nextLine();
			String s1=a.substring(0,a.indexOf("<"));
			String s2=a.substring(a.indexOf("<")+1,a.indexOf(">"));
			String s3=a.substring(a.indexOf(">")+1,a.lastIndexOf("<"));
			String s4=a.substring(a.lastIndexOf("<")+1,a.lastIndexOf(">"));
			String s5=a.substring(a.lastIndexOf(">")+1,a.length());
			String b=sc.nextLine().replaceAll("\\.","");
			System.out.println(s1+s2+s3+s4+s5+"\n"+b+s4+s3+s2+s5);
		}
	}
}
