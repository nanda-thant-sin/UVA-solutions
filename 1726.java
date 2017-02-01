import java.util.*;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++){
			int ques=sc.nextInt();
		    int[] rank=new int[10];
			int[] leak=new int[10];
			int r;
			int c;
			char a;
			for(int j=0;j<ques;j++){
				r=sc.nextInt();
				c=sc.nextInt();
				a=sc.next().charAt(0);
				if(c==1 && a=='c')
					leak[r-1]++;
				else if(c==0 && a=='i')
					rank[r-1]++;
			}
			int k=0;
			int current=0;
			int res=0;
			for(int j=0;j<10;j++){
				while(k<j){
					current+=rank[k++];
				}
				res+=current*leak[j];
			}
			System.out.println(res);
		}
	}
}
