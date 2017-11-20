import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=1;i<=testcase;i++){
			int d=sc.nextInt();
			int m=sc.nextInt();
			int y=sc.nextInt();
			int qy=sc.nextInt();
			if(d==29 && m==2){
				y+=4;
				int ans=0;
				for(int j=y;j<=qy;j+=4){
					if(j%400==0 || j%100!=0)
						ans++;
				}
				System.out.println("Case "+i+": "+ans);
			}
			else{
				System.out.println("Case "+i+": "+(qy-y));
			}
		}
	}
}
