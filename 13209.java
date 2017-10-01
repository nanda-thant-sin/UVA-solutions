import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int num,current;
        StringBuilder sb;
        ArrayList<Integer> remainder;
        for(int i=0;i<testcase;i++){
        	num=sc.nextInt();
        	sb=new StringBuilder();
        	remainder=new ArrayList<Integer>();
        	sb.append("0.");
        	current=(1%num)*10;
        	remainder.add(current);
        	while(true){
        		sb.append(current/num);
        		current=(current%num)*10;
        		if(remainder.contains(current)){
        			break;
        		}
        	}
        	System.out.println(sb.toString());
        }
        sc.close();
    }
}
