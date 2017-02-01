import java.util.*;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++){
			int ques=sc.nextInt();
		    int[] rank=new int[10];
			int[] leak=new int[ques];
			int r;
			int c;
			char a;
			int index=0;
			for(int j=0;j<ques;j++){
				r=sc.nextInt();
				c=sc.nextInt();
				a=sc.next().charAt(0);
				if(c==1 && a=='c')
					leak[index++]=r;
				else if(c==0 && a=='i')
					rank[r-1]++;
			}
			Arrays.sort(leak);
			int k=0;
			int current=0;
			int res=0;
			for(int j=ques-index;j<ques;j++){
				while(k+1<leak[j]){
					current+=rank[k++];
				}
				res+=current;
			}
			System.out.println(res);
		}
	}
}
