import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=1;i<=testcase;i++){
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int x=sc.nextInt();
        	int all=sum(n);
        	int selected=(x*k) + sum(k-1);
        	System.out.println("Case "+i+": "+(all-selected));
        }
        sc.close();
    }
    public static int sum(int n){
    	if(n%2==0){
    		return (n/2) * (1+n);
    	}
    	else{
    		return ( (n/2) * (1+n) ) + (n/2) + 1;
    	}
    }
}
