import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase=1;
        while(true){
        	int bytes=sc.nextInt();
        	if(bytes==0)
        		break;
        	System.out.println("Output for data set "+(testcase++)+", "+bytes+" bytes:");
        	int temp=0;
        	int i=1;
        	for(;bytes!=0;i++){
        		int curr=sc.nextInt();
        		temp+=curr;
        		bytes-=curr;
        		if(i%5==0){
        			if(temp==0)
        				System.out.println("   Time remaining: stalled");
        			else
        				System.out.println("   Time remaining: "+(int)Math.ceil(bytes*5.0/temp)+" seconds");
        			temp=0;
        		}
        	}
        	System.out.println("Total time: "+(i-1)+" seconds\n");
        }
        
    }
}
