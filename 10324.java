import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int caseNo=1;
        StringBuilder sb=new StringBuilder();
        while(sc.hasNext()){
        	String s=sc.next();
        	int q=sc.nextInt();
        	if(q==0){
        		break;
        	}
        	sb.append("Case "+(caseNo++)+":\n");
        	int[] data=new int[s.length()];
        	data[0]=1;
        	for(int i=1;i<s.length();i++){
        		if(s.charAt(i)==s.charAt(i-1)){
        			data[i]=data[i-1];
        		}
        		else{
        			data[i]=data[i-1]+1;
        		}
        	}
        	for(int i=0;i<q;i++){
        	    if(data[sc.nextInt()]==data[sc.nextInt()]){
        	    	sb.append("Yes\n");
        	    }
        	    else{
        	    	sb.append("No\n");
        	    }
        	}
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
