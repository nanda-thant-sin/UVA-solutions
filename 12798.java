import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	int result=0;
            boolean flag;
        	for(int i=0;i<n;i++){
        		flag=true;
        		for(int j=0;j<m;j++){
        			if(sc.nextInt()<=0){
        				flag=false;
        			}
        		}
        		if(flag){
        			result+=1;
        		}
        	}
        	System.out.println(result);
        }
        sc.close();
    }
}
