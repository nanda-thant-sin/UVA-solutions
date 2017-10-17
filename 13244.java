import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcase=sc.nextInt();
		long num,res;
		for(int i=1;i<=testcase;i++){
			num=sc.nextLong();
			res= (1+(num-2)) * ((num-1)/2);
			if((num-1)%2!=0){
				res+=(num-1)/2;
			}
			res+=num;
			System.out.println(res);
		}
		sc.close();
	}
}
