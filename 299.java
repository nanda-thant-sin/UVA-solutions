import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0){
			int l=sc.nextInt();
			int[] arr=new int[l];
			int swap=0;
			for(int i=0;i<l;i++){
				arr[i]=sc.nextInt();
				for(int j=0;j<i;j++){
					if(arr[i]<arr[j])
						swap++;
				}
			}
			System.out.println("Optimal train swapping takes "+swap+" swaps.");
		}
	}
}
