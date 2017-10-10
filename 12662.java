import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=sc.nextLine().split(" ");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
        	int p=sc.nextInt()-1;
        	if(!s[p].equals("?")){
        		System.out.println(s[p]);
        	}
        	else{
        		int l=p-1;int r=p+1;
        		while(l>=0 && s[l].equals("?")){
        			l-=1;
        		}
        		if(l<0){
        			l=0;
        		}
        		while(r<n && s[r].equals("?")){
        			r+=1;
        		}
        		if(r==n){
        			r-=1;
        		}
        		if(p-l==r-p && !s[l].equals("?") && !s[r].equals("?")){
        			System.out.println("middle of "+s[l]+" and "+s[r]);
        		}
        		else if((p-l<r-p && !s[l].equals("?")) || (p-l>r-p && s[r].equals("?"))){
        			for(int j=0;j<p-l;j++){
        				System.out.print("right of ");
        			}
        			System.out.println(s[l]);
        		}
        		else{
        			for(int j=0;j<r-p;j++){
        				System.out.print("left of ");
        			}
        			System.out.println(s[r]);
        		}
        	}
        }
        sc.close();
    }
}
