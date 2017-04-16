import java.util.*;
class Main
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long total;
		while(!s.equals("0")){
			total=0;
			for(int i=0;i<s.length();i++){
				if(i%2==0){
					total+=Integer.parseInt(s.charAt(i)+"");
				}else{
					total-=Integer.parseInt(s.charAt(i)+"");
				}
			}
			if(total%11==0){
				System.out.println(s +" is a multiple of 11.");
			}else{
				System.out.println(s +" is not a multiple of 11.");
			}
			s=sc.next();
		}
	}
}
