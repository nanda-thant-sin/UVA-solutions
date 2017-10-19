import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch[]={'A','B','C','D','E'};
		while(true){
			int n=sc.nextInt();
			if(n==0)
				break;
			for(int i=0;i<n;i++){
				int count=0,ans=0;
				for(int j=0;j<5;j++){
					int curr=sc.nextInt();
					if(curr<=127){
						count+=1;
						ans=j;
					}
				}
				if(count==1){
					System.out.println(ch[ans]);
				}
				else{
					System.out.println("*");
				}
			}
		}
		sc.close();
	}
}
