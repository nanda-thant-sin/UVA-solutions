import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=1;i<=testcase;i++){
			int n=sc.nextInt();
			int curr=1;
			int res=0;
			for(int j=0;j<n;j++){
				if(sc.nextInt()==curr){
					curr+=1;
				}
				else{
					res+=1;
				}
			}
			System.out.println("Case "+i+": "+res);
		}
		sc.close();
	}
	
}
