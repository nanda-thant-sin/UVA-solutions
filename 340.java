import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int game=1,n=sc.nextInt();
		int[] secret,secret1,guess;
		int weak,strong;
		while(n!=0){
			secret=new int[n];
			guess=new int[n];
			secret1=new int[n];
			for(int i=0;i<n;i++){
				secret[i]=sc.nextInt();
				secret1[i]=secret[i];
			}
			System.out.println("Game "+game+":");
			while(true){
				weak=strong=0;
				for(int i=0;i<n;i++){
					guess[i]=sc.nextInt();
				}
				if(guess[0]==0)
					break;
				for(int i=0;i<n;i++){
					if(secret[i]==guess[i]){
						strong++;
						secret1[i]=guess[i]=0;
					}
				}
				for(int i=0;i<n;i++){
					if(guess[i]!=0){
						for(int j=0;j<n;j++){
							if(guess[i]==secret1[j]){
								weak++;
								secret1[j]=guess[i]=0;
								break;
							}
						}
					}
				}
				secret1=secret.clone();
				System.out.println("    ("+strong+","+weak+")");
			}
			n=sc.nextInt();
			game++;
		}
	}
}
