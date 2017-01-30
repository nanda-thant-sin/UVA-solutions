import java.util.Scanner;
class Main{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++){
			int n=sc.nextInt()/10;
			int p=sc.nextInt();
			int res[]=new int[500];
			res[0]=1;
			for(int j=0;j<p;j++){
				int cal=sc.nextInt()/10;
				for(int k=498-cal;k>=0;k--){
					if(res[k]!=0)
						res[k+cal]=1;
				}
			}
			while(res[n]==0 && n!=499)
				n++;
			if(n!=499)System.out.println(n*10);
			else System.out.println("NO SOLUTION");
		}
	}
}
