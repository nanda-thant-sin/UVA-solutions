import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int[] index={12,11,11,10,10,10,9,9,9,9,8,8,8,8,8,7,7,7,7,7,7,6,6,6,6,6,5,5,5,5,4,4,4,3,3,2};
        sc.nextLine();
        for(int i=1;i<=testcase;i++){
        	String s=sc.nextLine();
        	int[] count=new int[36];
        	for(int j=0;j<s.length();j++){
        		char c=s.charAt(j);
        		if(c!=' '){
        			if(c>= '0' && c<='9'){
        				count[c-'0']++;
        			}
        			else{
        				count[c-'A'+10]++;
        			}
        		}
        	}
        	Arrays.sort(count);
        	int result=0;
        	for(int j=35;j>=0;j--){
        		if(count[j]==0){
        			break;
        		}
        		result+=index[j]*count[j];
        	}
        	System.out.println(result);
        }
        sc.close();
    }
}
