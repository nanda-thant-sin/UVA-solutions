import java.util.*;
class Main
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		String s,t;
		int c0,c1,que0,que1,out;
		char chs,cht;
		for(int i=1;i<=testcase;i++){
			s=sc.next();
			t=sc.next();
			que0=que1=c0=c1=out=0;
			for(int j=0;j<s.length();j++){
				chs=s.charAt(j);
				cht=t.charAt(j);
				if(chs=='?' && cht=='0'){
					que0++;
				}else if(chs=='?' && cht=='1'){
					que1++;
				}else if(chs=='0' && cht=='1'){
					c0++;
				}else if(chs=='1' && cht=='0'){
					c1++;
				}
			} 
			if(c1<=c0){
				System.out.println("Case "+i+": "+(c0+que0+que1));
			}else{
				out+=c0;
				c1-=c0;
				if(c1<=que1){
					que1-=c1;
					System.out.println("Case "+i+": "+(out+2*c1+que1+que0));
				}
				else System.out.println("Case "+i+": -1");
			}
		}
	}
}
