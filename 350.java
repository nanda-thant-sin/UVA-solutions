import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int i=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		boolean[] arr;
		int count;
		int cases=1;
		while(!(z==0 && i==0 && m==0 && l==0)){
			arr=new boolean[10000];
			count=0;
			while(true){
				l=(z*l+i)%m;
				if(arr[l])
					break;
				else{
					arr[l]=true;
					count++;
				}
			}
		  System.out.println("Case "+(cases++)+": "+count);
			z=sc.nextInt();
			i=sc.nextInt();
			m=sc.nextInt();
			l=sc.nextInt();
		}
	}
}
