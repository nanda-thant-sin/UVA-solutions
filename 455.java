import java.util.*;
public class Main
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
			String s=sc.next();
			int length= s.length();
			int j;
			for(j=0;j<length;j++){
				String temp=s.substring(0,j+1);
				String res=s.replaceAll(temp,"");
				if(res.length()==0){
					break;
				}
			}
			System.out.println(j+1);
			if(i!=t){
				System.out.println();
			}
		}
	}
}
