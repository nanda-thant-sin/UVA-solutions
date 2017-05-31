import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    int num;
		//if i is prime, isprime[i]=0
		int isprime[]=new int[1000001];
		isprime[0]=isprime[1]=1;
		for(int i=2;i<1000001;i++){
			if(isprime[i]==0){
				int mul=2;
				while(mul*i<1000001)
					isprime[mul++*i]=1;
			}
		}
		while(true){
			num=sc.nextInt();
			if(num==0)
				break;
			for(int i=3;i<=num/2;i++){
				if(isprime[i]==0 && isprime[num-i]==0){
					System.out.println(num +" = "+i+" + "+(num-i));
					break;
				}
			}
		}
	}
}
