import java.util.*;
public class Main
{
	public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
		while(true){
			int t=sc.nextInt();
			if(t==0)
				break;
			long[] abc=new long[t];
			for(int i=0;i<t;i++){
				int[] a=new int[5];
				for(int j=0;j<5;j++){
					a[j]=sc.nextInt();
				}
				Arrays.sort(a);
				long c=0;
				for(int j=0;j<5;j++){
					c=c*1000+a[j];
				}
				abc[i]=c;
			}
			Arrays.sort(abc);
			long curr=abc[0];
			int count=1;
			int maxcount=0;
			int ans=0;
			for(int i=1;i<t;i++){
				if(curr==abc[i])
					count++;
				else{
					curr=abc[i];
					if(maxcount==count)
						ans+=count;
					else if(maxcount<count){
						ans=count;
						maxcount=count;
					}
					count=1;
				}
			}
			if(maxcount==count)
				ans+=count;
			else if(maxcount<count){
				ans=count;
			}
			System.out.println(ans);
		}
	}
}
