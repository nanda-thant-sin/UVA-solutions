import java.util.*;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++){
			long a=sc.nextLong();
			long b=sc.nextLong();
			long up=1;
			long ares=b&a;
			long ores=b|a;
			while(true){
				if(a+up<b){
					ares&=a+up;
					ores|=a+up;
					up*=2;
				}
				else
					break;
				
			}
			System.out.println("Case "+i+": "+ores+" "+ares);
		}
	}
}
