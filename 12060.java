import java.util.*;
import java.math.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int a,c,sum,num,gcd,spacesize;
		//b=sum
		String sign,space;
	    c=sc.nextInt();
		num=1;
		while(c!=0){
			a=sum=0;sign="";space="";
			for(int i=0;i<c;i++){
				sum+=sc.nextInt();
			}
			if(sum<0)sign="- ";
			System.out.println("Case "+num+":");
			sum=Math.abs(sum);
			if(sum%c==0){
				System.out.println(sign+sum/c);
			}
			else{
				gcd=BigInteger.valueOf(sum).gcd(BigInteger.valueOf(c)).intValue();
				sum/=gcd;
				c/=gcd;
				if(sum>c){
					a=sum/c;
					sum%=c;
				}
				if(a!=0)sign+=a;
				spacesize=sign.length();
				for(int i=1;i<=spacesize;i++){
					space+=" ";
				}
				if(c==100)System.out.println(space+((sum>=10)?" ":"  ")+sum+"\n"+sign+"---\n"+space+c);
				else if(c>=10)System.out.println(space+((sum>=10)?"":" ")+sum+"\n"+sign+"--\n"+space+c);
				else System.out.println(space+sum+"\n"+sign+"-\n"+space+c);
			}
			num++;
			c=sc.nextInt();
		}
    }
}
